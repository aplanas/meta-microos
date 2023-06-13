SUMMARY = "A graphical models library for Python"
DESCRIPTION = "Pomegranate is a graphical models library for Python, implemented in Cython for speed."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python310-pomegranate-0.12.0-2.13.aarch64.rpm"
RPM_HASH = "a628f385757b96459c43deaff2a8d3d1af8d4c7d49ff521ab7091ffe5be38786176a6dc9ad016a9dccbd4418a7b43f12c9cf890373ec2812b36a7875dcb9203d"

RPROVIDES:${PN} += "python3-pomegranate \
python3.10dist(pomegranate) \
python310-pomegranate \
python310-pomegranate(aarch-64) \
python3dist(pomegranate)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-PyYAML \
python310-joblib \
python310-networkx \
python310-numpy \
python310-scipy"

inherit rpm
