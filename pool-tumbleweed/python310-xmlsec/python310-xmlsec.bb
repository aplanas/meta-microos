SUMMARY = "Python bindings for the XML Security Library"
DESCRIPTION = "Python bindings for the XML Security Library"
LICENSE = "MIT"

PV = "1.3.13"

RPM_NAME = "python310-xmlsec-1.3.13-2.6.aarch64.rpm"
RPM_HASH = "d1e6281e75bd488fdc1127a7de5ad7876044302e0191be87f06757522989daddba59619785c83ec26e11c25748f9ab993e0fcf90fdd9f58311c8a8d64f59f215"

RPROVIDES:${PN} += "python3-xmlsec \
python3.10dist(xmlsec) \
python310-xmlsec \
python310-xmlsec(aarch-64) \
python3dist(xmlsec)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libxml2.so.2()(64bit) \
libxml2.so.2(LIBXML2_2.4.30)(64bit) \
libxmlsec1.so.1()(64bit) \
python(abi) \
python310-lxml"

inherit rpm
