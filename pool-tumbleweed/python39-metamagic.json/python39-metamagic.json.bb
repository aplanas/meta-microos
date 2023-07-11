SUMMARY = "Python JSON encoder"
DESCRIPTION = "A Python 3 implementation of a JSON encoder for Python objects \
designed to be compatible with native JSON decoders in various web browsers."
LICENSE = "BSD-2-Clause"

PV = "0.9.6"

RPM_NAME = "python39-metamagic.json-0.9.6-4.12.aarch64.rpm"
RPM_HASH = "0a7d9fb276caaffcb9cb1d9b33003b59f584f175c979f4631eaa884e4bdb9491055f72a092570c6933770965e5567e2e1caa419f8ee07967a1aedbdabd88ac1c"

RPROVIDES:${PN} += "python3.9dist-metamagic.json \
python39-metamagic.json \
python3dist-metamagic.json"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
