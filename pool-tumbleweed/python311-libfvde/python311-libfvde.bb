SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python311-libfvde-20220915-3.14.aarch64.rpm"
RPM_HASH = "760caa88fd1c771118027dc0fc436606e535a132778b274520d88f28f137c46c8ac05790971b0273d498f6c165579a270cbc49d908b491d7bb7203966567cd2a"

RPROVIDES:${PN} += "python3-libfvde \
python311-libfvde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfvde.so.1 \
python-abi"

inherit rpm
