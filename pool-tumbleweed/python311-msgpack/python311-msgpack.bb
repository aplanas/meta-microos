SUMMARY = "MessagePack (de)serializer"
DESCRIPTION = "MessagePack (de)serializer for Python. \
 \
MessagePack is a binary-based efficient data interchange format that is \
focused on high performance. It is like JSON, but very fast and small."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "python311-msgpack-1.0.5-2.3.aarch64.rpm"
RPM_HASH = "fdab2435f279aac568b0f02c48ade4198db0ac20c8c024837ddd530599f3120ff35addeae68a84ec43de1c08d46c0aa96199339890878393a85f4b5533c1d3e0"

RPROVIDES:${PN} += "python3-msgpack \
python3-msgpack-python \
python3.11dist-msgpack \
python311-msgpack \
python311-msgpack-python \
python3dist-msgpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
