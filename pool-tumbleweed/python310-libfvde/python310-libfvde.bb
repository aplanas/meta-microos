SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python310-libfvde-20220915-3.15.aarch64.rpm"
RPM_HASH = "7a8768f4f52fc02cf9b238e97124915ec393af18a8c8b8222df27af3c89b33dbb0f3f9219a941d245d538dc2db6856b80b573ea9bb262c4880574d1b6f6b5c64"

RPROVIDES:${PN} += "python310-libfvde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfvde.so.1 \
python-abi"

inherit rpm
