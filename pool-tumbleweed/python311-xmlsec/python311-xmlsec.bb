SUMMARY = "Python bindings for the XML Security Library"
DESCRIPTION = "Python bindings for the XML Security Library"
LICENSE = "MIT"

PV = "1.3.13"

RPM_NAME = "python311-xmlsec-1.3.13-2.6.aarch64.rpm"
RPM_HASH = "6e5278dfff2844823cc3e21c969a4ff4c3ceb5ab2e747356aea321b51cf14f8ff3d0c00d98d7abd4750a82be4b73318f42853f12ff5d5f11eb609e5c03db7825"

RPROVIDES:${PN} += "python3.11dist(xmlsec) \
python311-xmlsec \
python311-xmlsec(aarch-64) \
python3dist(xmlsec)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxmlsec1.so.1()(64bit) \
python(abi) \
python311-lxml"

inherit rpm
