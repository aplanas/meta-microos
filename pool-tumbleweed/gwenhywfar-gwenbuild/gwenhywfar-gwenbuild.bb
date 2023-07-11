SUMMARY = "Specific build system for the aqbanking universe"
DESCRIPTION = "Gwenbuild is a lightweight and fast build system tailored for the \
aqbanking universe."
LICENSE = "LGPL-2.1-or-later"

PV = "5.10.1"

RPM_NAME = "gwenhywfar-gwenbuild-5.10.1-1.5.aarch64.rpm"
RPM_HASH = "6f7968c840d2a6b11c207cffc587b82d4ad45dbfe3b10ea56d09950d66b62146a81e1277b4896524a94c969a1fb9f1867a5f1f8d40e4c2c04dc6af00f0b27f73"

RPROVIDES:${PN} += "gwenhywfar-gwenbuild"

RDEPENDS:${PN} += "gwenhywfar-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgwenhywfar.so.79"

inherit rpm
