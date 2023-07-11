SUMMARY = "A Program to Generate Tag Files for Use with vi and Other Editors"
DESCRIPTION = "CTags (from Darren Hiebert) generates tag files from source code in C, \
C++, Eiffel, Fortran, and Java to be used with vi and its derivatives, \
Emacs, and several other editors."
LICENSE = "GPL-2.0-or-later"

PV = "5.8"

RPM_NAME = "ctags-5.8-13.4.aarch64.rpm"
RPM_HASH = "e010ea39003e38ee23e34164c2441d6e220475b2b7996e042c0d8994310a79db19ba53c0b8782e45fd2befd3f205f1764439bb7fe86719f04045093164d50eaa"

RPROVIDES:${PN} += "arduino-ctags \
ctags"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6 \
update-alternatives"

inherit rpm
