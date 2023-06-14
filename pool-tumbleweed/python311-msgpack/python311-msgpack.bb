SUMMARY = "MessagePack (de)serializer"
DESCRIPTION = "MessagePack (de)serializer for Python. \
 \
MessagePack is a binary-based efficient data interchange format that is \
focused on high performance. It is like JSON, but very fast and small."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "python311-msgpack-1.0.5-2.1.aarch64.rpm"
RPM_HASH = "1a027b9495b52eab47d00b757c140f42d53f6dcb9dc4014d953d98bb3c7fd98e1ecd605c94a1190742e1f45e4abc758cf18d8f5a904ef3549182013443d5660c"

RPROVIDES:${PN} += "python3.11dist-msgpack \
python311-msgpack \
python311-msgpack-python \
python3dist-msgpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
