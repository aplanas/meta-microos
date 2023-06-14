SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python311-libfvde-20220915-3.11.aarch64.rpm"
RPM_HASH = "caaa41845fc9b10505dd3cfea2311c1279e8089524efe948d11bfb6fa33976fd3a7825d1a28572eee5885f7ef465b3982acae33ad2bc5ade9ea2938e9991ab15"

RPROVIDES:${PN} += "python311-libfvde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfvde.so.1 \
python-abi"

inherit rpm
