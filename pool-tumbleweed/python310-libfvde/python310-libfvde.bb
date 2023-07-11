SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python310-libfvde-20220915-3.14.aarch64.rpm"
RPM_HASH = "b575218764846f6862026a2ef9f1267179d7431f4d0372f566e097879132b4d01bd7e389ca4655ef9566f0d8f5674265401268178d2d69baaf0c709634ede2de"

RPROVIDES:${PN} += "python310-libfvde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfvde.so.1 \
python-abi"

inherit rpm
