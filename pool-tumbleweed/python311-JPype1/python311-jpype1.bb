SUMMARY = "Python to Java bridge"
DESCRIPTION = "A Python to Java bridge."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python311-JPype1-1.4.1-1.4.aarch64.rpm"
RPM_HASH = "0559a1c67ef3d0dc2087e19f7ec374a598f46605654f4a0904b643c53aef5e6c125306eb0f3a7df1a4b0cf40b31c4fcdb9c1748decb544f4b1a94876f92eaedd"

RPROVIDES:${PN} += "python3.11dist-jpype1 \
python311-JPype1 \
python3dist-jpype1"

RDEPENDS:${PN} += "java-15-openjdk-headless \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
