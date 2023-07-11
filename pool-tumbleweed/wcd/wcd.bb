SUMMARY = "Chdir for DOS and Unix"
DESCRIPTION = "Wcd.   Directory changer for DOS and Unix.  Another Norton \
Change Directory (NCD) clone. \
 \
Wcd is a command-line program to change directory fast. It \
saves time typing at the keyboard.  One needs to type only \
a part of a directory  name and wcd  will jump to it.  Wcd \
has a fast selection  method  in  case of multiple matches \
and allows aliasing and  banning of directories.  Wcd also \
includes a full-screen interactive  directory tree browser \
with speed search."
LICENSE = "GPL-2.0-only"

PV = "6.0.5"

RPM_NAME = "wcd-6.0.5-1.2.aarch64.rpm"
RPM_HASH = "aa86a8ae4e7c322a4299b00d5ed8472425dcecd72ed1319095e00c0bbd5d122ef2cd8385057e8604fbe8235a9fc5b028eea12281146f12db2aa4119d032ed414"

RPROVIDES:${PN} += "config-wcd \
wcd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6 \
libunistring.so.5"

inherit rpm
