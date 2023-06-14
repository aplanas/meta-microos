SUMMARY = "Python bindings for wc(s)width"
DESCRIPTION = "Python bindings for wc(s)width"
LICENSE = "MIT"

PV = "0.1.8"

RPM_NAME = "python39-cwcwidth-0.1.8-1.5.aarch64.rpm"
RPM_HASH = "72bf1710680d01c61a00e81743d5dea571b6e66db60e5193133061b927060075460a351c0bccdc4bbc99625af12cdb1b868e0c7f15cc1b18d1f440eccf7ef949"

RPROVIDES:${PN} += "python3.9dist-cwcwidth \
python39-cwcwidth \
python3dist-cwcwidth"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
