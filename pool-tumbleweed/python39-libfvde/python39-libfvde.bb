SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python39-libfvde-20220915-3.14.aarch64.rpm"
RPM_HASH = "480462d835521566872f43919efd8514cb07d05e82201ab7724092afe426cd17c74368f2452ba823e9bfb5e646eb49bb0cb170fddbb142312c24dd45910b373d"

RPROVIDES:${PN} += "python39-libfvde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfvde.so.1 \
python-abi"

inherit rpm
