SUMMARY = "Python3 bindings for ldns"
DESCRIPTION = "Python bindings for the ldns library"
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "python3-ldns-1.8.3-1.4.aarch64.rpm"
RPM_HASH = "3520864f79d4b817f98cf40354234ed11f864bf8b1277a68d2256ced5a9dad4a10802fde36f239fd4b7b2f5d611e9e320791a486adcefc4ea2ba516d64ebae22"

RPROVIDES:${PN} += "python3-ldns \
python3-ldns(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.28)(64bit) \
libldns.so.3()(64bit) \
libldns3 \
libpython3.10.so.1.0()(64bit) \
python(abi)"

inherit rpm
