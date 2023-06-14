SUMMARY = "Development files for nanopb"
DESCRIPTION = "Development files for nanopb - a C implementation of Google's Protocol Buffers \
data format."
LICENSE = "Zlib"

PV = "0.4.6"

RPM_NAME = "nanopb-devel-0.4.6-2.3.aarch64.rpm"
RPM_HASH = "0322029df39915da7f8db9f9f63ede57b592ad27d89149cd7422cd12dee2f23dfd7ad6cf49b6df51e094470f87c76d7b380aa465b9cf2571732c7adaca39d0f2"

RPROVIDES:${PN} += "cmake-nanopb \
nanopb-devel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
libprotobuf-nanopb0 \
python-abi"

inherit rpm
