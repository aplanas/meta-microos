SUMMARY = "Library for AES encryption"
DESCRIPTION = "libcaes is a library for AES encryption."
LICENSE = "LGPL-3.0-or-later"

PV = "20230406"

RPM_NAME = "python39-libcaes-20230406-2.1.aarch64.rpm"
RPM_HASH = "090b5f03ef3d5907a4c35d306a369f4fcd4960ca3dda0755327c6e80518a7ef692d774224b3afe365df525e4f2b8129972fd95f4dd3ff04c704d37a35ebe7212"

RPROVIDES:${PN} += "python39-libcaes"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcaes.so.1 \
libcerror.so.1 \
python-abi"

inherit rpm
