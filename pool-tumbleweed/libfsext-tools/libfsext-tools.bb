SUMMARY = "Tools to access the Extended File System (ext)"
DESCRIPTION = "Tools to access the Extended File System.  See libfsext for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20230603"

RPM_NAME = "libfsext-tools-20230603-1.5.aarch64.rpm"
RPM_HASH = "7b9ef4ea90fe781cb74cd18e709001696c1e70ff981b9eab3b6ec91722f5528a1894ef9f5be8a7bf59a77be03f064aea10ca5e520a3c4d09528b64ae66365a1f"

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
