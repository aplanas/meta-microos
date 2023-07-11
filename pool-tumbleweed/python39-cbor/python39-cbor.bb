SUMMARY = "RFC 7049 - Concise Binary Object Representation"
DESCRIPTION = "RFC 7049 - Concise Binary Object Representation"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python39-cbor-1.0.0-1.25.aarch64.rpm"
RPM_HASH = "07e45a0f1ebfa1c206868cc1ae23f3d4e0382bf1d3d4a2ef49b6533457beb2e1175cc2b7f1a92e0bea42b475233a56504326c0c7a5a42acbece7debea7151135"

RPROVIDES:${PN} += "python3.9dist-cbor \
python39-cbor \
python3dist-cbor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python39-base"

inherit rpm
