SUMMARY = "Python to Java bridge"
DESCRIPTION = "A Python to Java bridge."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python39-JPype1-1.4.1-2.3.aarch64.rpm"
RPM_HASH = "d754c666687e120028eb9a8cdd976adbd2da1e5a101e22af6debe8c37c6eb1863e4d8193258998e3c4bc4d90fe27fadf6b71b705791321fc2a64a424d04c9764"

RPROVIDES:${PN} += "python3.9dist-jpype1 \
python39-JPype1 \
python3dist-jpype1"

RDEPENDS:${PN} += "java-headless \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
