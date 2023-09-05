SUMMARY = "Python interface for libuv"
DESCRIPTION = "Python interface for libuv."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "python310-pyuv-1.4.0-7.1.aarch64.rpm"
RPM_HASH = "6247cb7cab3283edc884a7340654d250a558a7e523f0dcfbb94bb195e7a8885b861f453fdea2bf5a595716ba9a5ef5d7c290921fecc133a38470171598c0998a"

RPROVIDES:${PN} += "python3.10dist-pyuv \
python310-pyuv \
python3dist-pyuv"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libuv.so.1 \
python-abi"

inherit rpm
