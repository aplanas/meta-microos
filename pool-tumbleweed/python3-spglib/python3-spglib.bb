SUMMARY = "Python bindings for spglib/libsymspg"
DESCRIPTION = "Spglib is a C library to find and handle crystal symmetries."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "python3-spglib-2.0.2-1.4.aarch64.rpm"
RPM_HASH = "a4b779555f6dcd88b91c42c820fc20d80237cbdb69bd33a9f92675757bbb331a818d9458f56cb26a277110c636948739a19bb7598851d918486707d799f795ed"

RPROVIDES:${PN} += "python3-spglib \
python3.11dist-spglib \
python3dist-spglib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python3-numpy"

inherit rpm
