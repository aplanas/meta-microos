SUMMARY = "Tools to Create and Apply deltarpms"
DESCRIPTION = "Python 3 bindings for deltarpm"
LICENSE = "BSD-3-Clause"

PV = "3.6.3"

RPM_NAME = "python3-deltarpm-3.6.3-2.6.aarch64.rpm"
RPM_HASH = "0bf6169d45eb934de52dee680c669fedc88c744d6fb71f4e5069aacdf27919243d262a7d3125e7a8a20c44c6290c03dad9c66f9409f0caad7d0d306e0bf42f35"

RPROVIDES:${PN} += "python3-deltarpm \
python3-deltarpm(aarch-64)"

RDEPENDS:${PN} += "deltarpm \
ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit) \
liblzma.so.5()(64bit) \
libzstd.so.1()(64bit) \
python(abi)"

inherit rpm
