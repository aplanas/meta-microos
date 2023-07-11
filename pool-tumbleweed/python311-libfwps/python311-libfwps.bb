SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230202"

RPM_NAME = "python311-libfwps-20230202-1.7.aarch64.rpm"
RPM_HASH = "c83ff211a976abb579f8b023c7a854f020083967bc7ce9a0d1b104b14f09902244069f3d6cd14e9ff29301d50ccbf70236cc4d0100326a424cfe7746136c6a2c"

RPROVIDES:${PN} += "python3-libfwps \
python311-libfwps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfwps.so.1 \
python-abi"

inherit rpm
