SUMMARY = "Python JSON encoder"
DESCRIPTION = "A Python 3 implementation of a JSON encoder for Python objects \
designed to be compatible with native JSON decoders in various web browsers."
LICENSE = "BSD-2-Clause"

PV = "0.9.6"

RPM_NAME = "python310-metamagic.json-0.9.6-4.12.aarch64.rpm"
RPM_HASH = "829bf5f71dc3741c435fcbd0574069b2a49fb2b31e6bf00f3979efcf3e69f65d3012117062f8bfa6155af209485bf7e054ae9e01e7fa6ec58976ae3f689534a4"

RPROVIDES:${PN} += "python3.10dist-metamagic.json \
python310-metamagic.json \
python3dist-metamagic.json"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
