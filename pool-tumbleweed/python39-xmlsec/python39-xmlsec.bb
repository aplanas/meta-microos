SUMMARY = "Python bindings for the XML Security Library"
DESCRIPTION = "Python bindings for the XML Security Library"
LICENSE = "MIT"

PV = "1.3.13"

RPM_NAME = "python39-xmlsec-1.3.13-2.6.aarch64.rpm"
RPM_HASH = "91c9a5408879a11c83a6422bb524ae12a7a8a3ef457aadc09f6165c461121020dd98efa26b8fdca99bc4116a621844e421218547c96109af9125e8c17ac4eb98"

RPROVIDES:${PN} += "python3.9dist(xmlsec) \
python39-xmlsec \
python39-xmlsec(aarch-64) \
python3dist(xmlsec)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxmlsec1.so.1()(64bit) \
python(abi) \
python39-lxml"

inherit rpm
