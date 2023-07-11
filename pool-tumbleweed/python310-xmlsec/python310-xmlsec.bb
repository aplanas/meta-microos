SUMMARY = "Python bindings for the XML Security Library"
DESCRIPTION = "Python bindings for the XML Security Library"
LICENSE = "MIT"

PV = "1.3.13"

RPM_NAME = "python310-xmlsec-1.3.13-2.9.aarch64.rpm"
RPM_HASH = "c3c7c8bc6761eb2337061eaf5a7c0041f776cf4e13e9c9035eebea60bd24761d98614f3aa752eb6232af61d950573792d049eb73ddad56723449eb845500710b"

RPROVIDES:${PN} += "python3.10dist-xmlsec \
python310-xmlsec \
python3dist-xmlsec"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxml2.so.2 \
libxmlsec1.so.1 \
python-abi \
python310-lxml"

inherit rpm
