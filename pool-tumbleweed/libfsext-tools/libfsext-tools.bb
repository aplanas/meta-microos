SUMMARY = "Tools to access the Extended File System (ext)"
DESCRIPTION = "Tools to access the Extended File System.  See libfsext for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20230603"

RPM_NAME = "libfsext-tools-20230603-1.4.aarch64.rpm"
RPM_HASH = "4e2ed4f63aec8f086ba2abf6e30ca6c02e4aaed410576262fe7eced1f42780df89a2fe1a4b887e499bb347c0fd2cb3d558cc06d7a575ced800ec4caf642b4dc8"

RPROVIDES:${PN} += "libfsext-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfsext.so.1 \
libfsext1 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
