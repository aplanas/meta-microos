SUMMARY = "Library to access the File Vault Drive Encryption format"
DESCRIPTION = "libfvde is a library to access the File Vault Drive Encryption format."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220915"

RPM_NAME = "python39-libfvde-20220915-4.1.aarch64.rpm"
RPM_HASH = "de106f321cfebb1542063d2b4d9ea895140ae3f7567f0583ed42135eb53f0c446373bf5f989d3b6a18d2e6e1d498b553c23c4562ef3348e3e375a47881c73944"

RPROVIDES:${PN} += "python39-libfvde"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfvde.so.1 \
python-abi"

inherit rpm
