SUMMARY = "Python JSON encoder"
DESCRIPTION = "A Python 3 implementation of a JSON encoder for Python objects \
designed to be compatible with native JSON decoders in various web browsers."
LICENSE = "BSD-2-Clause"

PV = "0.9.6"

RPM_NAME = "python311-metamagic.json-0.9.6-4.12.aarch64.rpm"
RPM_HASH = "95573265479340a56239e14b33d8032872c144256ddb59c3b8816246bb08ab1948f7ab78665c9d84269e7afe922aa388a5e2eafeb8ff7b58ce9af9f66f612500"

RPROVIDES:${PN} += "python3-metamagic.json \
python3.11dist-metamagic.json \
python311-metamagic.json \
python3dist-metamagic.json"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
