SUMMARY = "Utilities for Making and Checking MS-DOS FAT File Systems on Linux"
DESCRIPTION = "The dosfstools package includes the mkdosfs and dosfsck utilities, which \
respectively make and check MS-DOS FAT file systems on hard drives or on \
floppies."
LICENSE = "GPL-3.0-or-later"

PV = "4.2"

RPM_NAME = "dosfstools-4.2-4.2.aarch64.rpm"
RPM_HASH = "c9c12e3e862cd079bda1dfdc47c4c5349211537800b2f62419af653e9cbb07221c03fe1a8322f685269f1688d50b918b4ed7ee4419f395a5398c77883d467d1e"

RPROVIDES:${PN} += "dosfsck \
dosfstools \
dosfstools(aarch-64) \
mkdosfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
