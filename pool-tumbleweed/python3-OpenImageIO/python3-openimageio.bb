SUMMARY = "Python Bindings for OpenImageIO"
DESCRIPTION = "This package contains python bindings for OpenImageIO."
LICENSE = "BSD-3-Clause"

PV = "2.4.12.0"

RPM_NAME = "python3-OpenImageIO-2.4.12.0-1.2.aarch64.rpm"
RPM_HASH = "1f69d7dfa0aced5e97f92d908dbbe8469c5079c01b75c48a925cc81ee263097bcc048f370700c3462ea605dec3ccaed2c9335217c0eed6537dcc590184ee64a4"

RPROVIDES:${PN} += "python3-OpenImageIO"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libImath-3-1.so.29 \
libOpenImageIO-Util.so.2.4 \
libOpenImageIO.so.2.4 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
