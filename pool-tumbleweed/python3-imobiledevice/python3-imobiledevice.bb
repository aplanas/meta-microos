SUMMARY = "Python bindings for libimobiledevice"
DESCRIPTION = "Contains Python bindings for developing applications that use libimobiledevice."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0+190git.20230705"

RPM_NAME = "python3-imobiledevice-1.3.0+190git.20230705-1.1.aarch64.rpm"
RPM_HASH = "ff8d850b73e4739379d999364191266c27a4917e7639e27b032948b8dc67640f06f4f80de17b660e6790599907c3f9e3d9240ec3702ca052ab60653b394c6b14"

RPROVIDES:${PN} += "python3-imobiledevice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libimobiledevice-1-0-6 \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.4 \
libpython3.11.so.1.0 \
python-abi \
python3-plist"

inherit rpm
