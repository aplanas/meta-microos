SUMMARY = "Python to Java bridge"
DESCRIPTION = "A Python to Java bridge."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python310-JPype1-1.4.1-1.4.aarch64.rpm"
RPM_HASH = "9479764e71197c19a1894c7790cd9aa2b648d52e0bef6ef5af1e77bb4e915a0efbcf3d4fd9cecf2ccff2eead6626293c9313f8efd05bffbcc2184314830e908b"

RPROVIDES:${PN} += "python3-JPype1 \
python3.10dist(jpype1) \
python310-JPype1 \
python310-JPype1(aarch-64) \
python3dist(jpype1)"

RDEPENDS:${PN} += "java-15-openjdk-headless \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
