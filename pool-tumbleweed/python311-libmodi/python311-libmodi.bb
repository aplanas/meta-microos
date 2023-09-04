SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python311-libmodi-20221023-4.1.aarch64.rpm"
RPM_HASH = "edce9b1adfd9e5cf08ee0c11835ea0c80b69a036d37f428190f7a53b92ad198f3e8dcaa837bcf3acfee3e0fe3f86816ec162fa2daf22390f89a130905f3992d9"

RPROVIDES:${PN} += "python3-libmodi \
python311-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm
