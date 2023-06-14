SUMMARY = "Python JSON encoder"
DESCRIPTION = "A Python 3 implementation of a JSON encoder for Python objects \
designed to be compatible with native JSON decoders in various web browsers."
LICENSE = "BSD-2-Clause"

PV = "0.9.6"

RPM_NAME = "python39-metamagic.json-0.9.6-4.10.aarch64.rpm"
RPM_HASH = "dc0f6897aff0c5e3fedea0437d4506706661159ecea2533454384dbfab5b6e818fa8d7c52400288ddcb7ee26f5494c5fe70fad3f908afc7e0fe2ccebda4a3ac3"

RPROVIDES:${PN} += "python3.9dist-metamagic.json \
python39-metamagic.json \
python3dist-metamagic.json"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
