SUMMARY = "The 3D Athena Widget Set"
DESCRIPTION = "Xaw3d is a general-purpose replacement for the Athena toolkit which \
adds a 3D appearance and support for XPM images."
LICENSE = "MIT"

PV = "1.6.4"

RPM_NAME = "libXaw3d6-1.6.4-1.4.aarch64.rpm"
RPM_HASH = "435ace5825e5b912588868d90f3966210473f0dbf82291de440406ba6f43785241b89623e4fb8249492a1c21f3a0a0e54387119e639a7113ccdfd1372c2a7fe5"

RPROVIDES:${PN} += "libXaw3d.so.6 \
libXaw3d6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXmu.so.6 \
libXpm.so.4 \
libXt.so.6 \
libc.so.6"

inherit rpm
