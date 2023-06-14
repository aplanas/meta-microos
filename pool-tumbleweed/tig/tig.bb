SUMMARY = "An ncurses-based text-mode interface for git"
DESCRIPTION = "Tig is a git repository browser that additionally can act as a pager \
for output from various git commands. \
 \
When browsing repositories, it uses the underlying git commands to \
present the user with various views, such as summarized revision log \
and showing the commit with the log message, diffstat, and the diff. \
 \
Using it as a pager, it will display input from stdin and colorize it."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.8"

RPM_NAME = "tig-2.5.8-1.2.aarch64.rpm"
RPM_HASH = "ecec609db3310745357d297c0b869e10a43ccdf91f558895fdc9743a373dc3acd336d06b091d72b760c0ed0c11541ec6bc14cd270024b4d10fe23569d41d43fc"

RPROVIDES:${PN} += "config-tig \
tig"

RDEPENDS:${PN} += "git-core \
ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libpcre2-8.so.0 \
libpcre2-posix.so.3 \
libreadline.so.8 \
libtinfo.so.6"

inherit rpm
