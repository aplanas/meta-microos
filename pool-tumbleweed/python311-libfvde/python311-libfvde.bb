SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python311-libfvde-20220915-3.15.aarch64.rpm"
RPM_HASH = "06fc5a4728e81ebdf1f4c18f47ce8c55b15d1ec78903ecfca4ad3d6be55430e3b3bdd37c61dda5ba94ad148ff0a2bea82d1a451cbff94c1985ca86279329b782"

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
