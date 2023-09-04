SUMMARY = "Library for binary signature scanning"
DESCRIPTION = "libsigscan is a library for binary signature scanning \
 \
libsigscan is part of the libyal family of libraries"
LICENSE = "LGPL-3.0-or-later"

PV = "20230109"

RPM_NAME = "python310-libsigscan-20230109-2.1.aarch64.rpm"
RPM_HASH = "2b8ddd7179f117e8faff9445d0d1429cef885095b97e4026e0deaccce8220097f5570e4094be33742c4d88188766a20b491c8cffeef303c637ce79f68cf08cd0"

RPROVIDES:${PN} += "python310-libsigscan"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsigscan.so.1 \
python-abi"

inherit rpm
