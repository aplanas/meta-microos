SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python311-libfvde-20220915-4.1.aarch64.rpm"
RPM_HASH = "0dd5356d18a4b87095d1c517ce974652a95f70ae81cac99ee54b282fba03bb211c4dc0d72ae36a26edb24281b708ca458aa29823de416f69a07c73d15f5a0c01"

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
