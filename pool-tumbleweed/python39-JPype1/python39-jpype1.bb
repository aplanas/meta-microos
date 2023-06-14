SUMMARY = "Python to Java bridge"
DESCRIPTION = "A Python to Java bridge."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python39-JPype1-1.4.1-1.4.aarch64.rpm"
RPM_HASH = "e05e96318fdc4f64262cc4e8730e73c2306fc6f2075107bbcc6048fc7733bde4848aa54ab9794c4b95ddd08c45fdd5f3e16f6125f14a17e51543fa62c60bcae1"

RPROVIDES:${PN} += "python3.9dist-jpype1 \
python39-JPype1 \
python3dist-jpype1"

RDEPENDS:${PN} += "java-15-openjdk-headless \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
