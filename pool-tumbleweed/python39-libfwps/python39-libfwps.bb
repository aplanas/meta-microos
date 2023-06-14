SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230202"

RPM_NAME = "python39-libfwps-20230202-1.4.aarch64.rpm"
RPM_HASH = "8bf9dc6d20b79d28eddbd46c95a734688426595fb74c3deb3b62d7f8f8ad88d6adeb5929151e0418b3c5fecf6b27f9c85da9429551a639f0a1d83b8f5f67fa1d"

RPROVIDES:${PN} += "python39-libfwps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfwps.so.1 \
python-abi"

inherit rpm
