SUMMARY = "Python bindings for the XML Security Library"
DESCRIPTION = "Python bindings for the XML Security Library"
LICENSE = "MIT"

PV = "1.3.13"

RPM_NAME = "python39-xmlsec-1.3.13-2.9.aarch64.rpm"
RPM_HASH = "d4826c155fe6f1fb5f085c311a04a2b56f1abdaafcc7caeb6959d2160e4fb7c91798c5b299bd40651f5544a96ecc1373454327822c0192ad5d9f6e424e50644f"

RPROVIDES:${PN} += "python3.9dist-xmlsec \
python39-xmlsec \
python3dist-xmlsec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libxmlsec1.so.1 \
python-abi \
python39-lxml"

inherit rpm
