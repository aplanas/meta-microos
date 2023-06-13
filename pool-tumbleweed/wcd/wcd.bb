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

RPM_NAME = "wcd-6.0.5-1.1.aarch64.rpm"
RPM_HASH = "e195a42c11953a66470e0d93ad64cc1169a928c6d596a0a494361117ffc057494758be2d576ea41491354b73f1bd812c37d4f2a8570178ea3dccf5179c8cd42c"

RPROVIDES:${PN} += "config(wcd) \
wcd \
wcd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libncursesw.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libunistring.so.5()(64bit)"

inherit rpm
