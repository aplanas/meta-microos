SUMMARY = "MessagePack (de)serializer"
DESCRIPTION = "MessagePack (de)serializer for Python. \
 \
MessagePack is a binary-based efficient data interchange format that is \
focused on high performance. It is like JSON, but very fast and small."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "python39-msgpack-1.0.5-2.3.aarch64.rpm"
RPM_HASH = "f8968eda2283dde3b45b89e5b8359090476e9450e3d3f9127a3e2124bf0058bd0b490d79a5a76b5dee398daa827825622c632b1f3a09a78599f1b649c45e085c"

RPROVIDES:${PN} += "python3.9dist-msgpack \
python39-msgpack \
python39-msgpack-python \
python3dist-msgpack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
