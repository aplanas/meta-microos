SUMMARY = "Utilities for Making and Checking MS-DOS FAT File Systems on Linux"
DESCRIPTION = "The dosfstools package includes the mkdosfs and dosfsck utilities, which \
respectively make and check MS-DOS FAT file systems on hard drives or on \
floppies."
LICENSE = "GPL-3.0-or-later"

PV = "4.2"

RPM_NAME = "dosfstools-4.2-4.3.aarch64.rpm"
RPM_HASH = "af82d6a4aa782ea546dffb344a8a2a22b75e49dd988dbbb3ded3d81e39aa6160bf3ad23ed7b03edd7bf5f6405e41c45a90ee13aaacfcf9038e8a2f8ad252aa5b"

RPROVIDES:${PN} += "dosfsck \
dosfstools \
mkdosfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
