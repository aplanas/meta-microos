SUMMARY = "Python bindings for the XML Security Library"
DESCRIPTION = "Python bindings for the XML Security Library"
LICENSE = "MIT"

PV = "1.3.13"

RPM_NAME = "python311-xmlsec-1.3.13-2.9.aarch64.rpm"
RPM_HASH = "8f49b674702592d1764e1b8440295ef84c984211357fc717794ebf334972f7e0d2a9dfd7748e48702047cb9b0d800f2f57fc4fa2a4cb8307cfdbb75f5390a84f"

RPROVIDES:${PN} += "python3-xmlsec \
python3.11dist-xmlsec \
python311-xmlsec \
python3dist-xmlsec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libxmlsec1.so.1 \
python-abi \
python311-lxml"

inherit rpm
