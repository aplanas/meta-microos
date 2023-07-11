SUMMARY = "Python to Java bridge"
DESCRIPTION = "A Python to Java bridge."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python311-JPype1-1.4.1-2.3.aarch64.rpm"
RPM_HASH = "be270cd84c10b7c377dd94468d5ab439c8621f514af6fcdf9b60fe4c2217acffe011dad77bbd2aeeed1fb8e3bc1025689fd0f003f202bdb76598d8bd8240bcc0"

RPROVIDES:${PN} += "python3-JPype1 \
python3.11dist-jpype1 \
python311-JPype1 \
python3dist-jpype1"

RDEPENDS:${PN} += "java-headless \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
