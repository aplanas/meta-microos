SUMMARY = "Tools to Create and Apply deltarpms"
DESCRIPTION = "Python 3 bindings for deltarpm"
LICENSE = "BSD-3-Clause"

PV = "3.6.3"

RPM_NAME = "python3-deltarpm-3.6.3-2.7.aarch64.rpm"
RPM_HASH = "ec13c32a412d18f5db44dd83d6e77e19b439aa766a8d394d01dc6ad2c7f7050435c21b6a5b98bdaa46795a880474b7ef1fa7cf7fadce499f84fa5b080f3e3ee5"

RPROVIDES:${PN} += "python3-deltarpm"

RDEPENDS:${PN} += "deltarpm \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
libzstd.so.1 \
python-abi"

inherit rpm
