SUMMARY = "A Program to Generate Tag Files for Use with vi and Other Editors"
DESCRIPTION = "CTags (from Darren Hiebert) generates tag files from source code in C, \
C++, Eiffel, Fortran, and Java to be used with vi and its derivatives, \
Emacs, and several other editors."
LICENSE = "GPL-2.0-or-later"

PV = "5.8"

RPM_NAME = "ctags-5.8-13.3.aarch64.rpm"
RPM_HASH = "70877780e1e14155cff09860b813b49c7e4bde2a1f9bfdd98d352f253db0a643a1161c941d28d2f717ec6cb3c15febdd3d46e65746631614d723bbf21d4ab616"

RPROVIDES:${PN} += "arduino-ctags \
ctags"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
