SUMMARY = "Development files for nanopb"
DESCRIPTION = "Development files for nanopb - a C implementation of Google's Protocol Buffers \
data format."
LICENSE = "Zlib"

PV = "0.4.6"

RPM_NAME = "nanopb-devel-0.4.6-2.4.aarch64.rpm"
RPM_HASH = "af9c13ced8071061d944370c0160b8339a357289a7aebbe04e2c8b581348e39bba6e334d8b2753aaa0d08f73ad5f2397a8311e1cd891d061c7b4dde79cd1dbb1"

RPROVIDES:${PN} += "cmake-nanopb \
nanopb-devel"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
libprotobuf-nanopb0 \
python-abi"

inherit rpm
