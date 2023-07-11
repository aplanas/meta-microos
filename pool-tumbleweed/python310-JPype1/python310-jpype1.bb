SUMMARY = "Python to Java bridge"
DESCRIPTION = "A Python to Java bridge."
LICENSE = "Apache-2.0"

PV = "1.4.1"

RPM_NAME = "python310-JPype1-1.4.1-2.3.aarch64.rpm"
RPM_HASH = "6e5ca7579d89ec1f6fcd5e4b703ecfb033fd38c7816b99fb5fce3c763d94da19b83fb6cf5e1a96facb44a45f9878e7e918022aecdc738a3302ec6bf367ef759d"

RPROVIDES:${PN} += "python3.10dist-jpype1 \
python310-JPype1 \
python3dist-jpype1"

RDEPENDS:${PN} += "java-headless \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
