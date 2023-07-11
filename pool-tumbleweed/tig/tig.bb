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

RPM_NAME = "tig-2.5.8-1.3.aarch64.rpm"
RPM_HASH = "8e82b4825390bc16ea4f1b9889b74a6206cfe52b853ab40725f47daec0e4cd987050c0f9678203b037bb6e11fcf2ed7f3de2647b3becfc6bcf1e07b8bac73703"

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
