SUMMARY = "A graphical models library for Python"
DESCRIPTION = "Pomegranate is a graphical models library for Python, implemented in Cython for speed."
LICENSE = "MIT"

PV = "0.12.0"

RPM_NAME = "python311-pomegranate-0.12.0-2.13.aarch64.rpm"
RPM_HASH = "67684a55fe2e4b9db77a2095fdfdebf50f67825c1538ff64c3c263aef5a3274b9ee04cb13ed3983b1194ba5e8e726120f97f2a6151b8b92bdf54a726d831cc81"

RPROVIDES:${PN} += "python3.11dist(pomegranate) \
python311-pomegranate \
python311-pomegranate(aarch-64) \
python3dist(pomegranate)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python311-PyYAML \
python311-joblib \
python311-networkx \
python311-numpy \
python311-scipy"

inherit rpm
