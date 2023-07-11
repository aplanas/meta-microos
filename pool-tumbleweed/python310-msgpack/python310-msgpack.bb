SUMMARY = "MessagePack (de)serializer"
DESCRIPTION = "MessagePack (de)serializer for Python. \
 \
MessagePack is a binary-based efficient data interchange format that is \
focused on high performance. It is like JSON, but very fast and small."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "python310-msgpack-1.0.5-2.3.aarch64.rpm"
RPM_HASH = "88767742570212966edf043b00860c555b6c23b9718d9ec43d2965d8bf03da9656547e0a4f726a0a343a65d6f71d1b442a0ac6cf1fd253f35a5b0e4d5142e4b4"

RPROVIDES:${PN} += "python3.10dist-msgpack \
python310-msgpack \
python310-msgpack-python \
python3dist-msgpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
