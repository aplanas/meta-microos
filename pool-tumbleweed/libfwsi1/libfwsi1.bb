SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "libfwsi1-20230710-1.1.aarch64.rpm"
RPM_HASH = "c8d549e44bf80c9441cd8748f6b82b8846748f3013b9adc01b76e553b4e51fcc8608fec5d8c4efabfbe97679d2a1e0e9af37252b1cf3cb6954c790ed093a3f82"

RPROVIDES:${PN} += "libfwsi.so.1 \
libfwsi1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
