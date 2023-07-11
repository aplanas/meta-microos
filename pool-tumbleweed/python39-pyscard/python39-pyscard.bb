SUMMARY = "Python module adding smart card support"
DESCRIPTION = "Python-pyscard consists of smartcard.scard, an extension module wrapping \
Windows smart card base components (also known as PCSC) on Windows and PCSC \
lite on linux and Mac OS X Tiger and Leopard, and smartcard, a higher level \
python framework built on top of the raw PCSC API."
LICENSE = "LGPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "python39-pyscard-2.0.7-1.3.aarch64.rpm"
RPM_HASH = "c4b79721b4b03d4f823a06dd8707e24cd52c5b9d1c2b663824a102fd8cf0c344c1803a59ac47980e574d7df09c66b66669c9c70c29cb2996b92d87889cdfbb4f"

RPROVIDES:${PN} += "python3.9dist-pyscard \
python39-pyscard \
python3dist-pyscard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pcsc-ccid \
python-abi"

inherit rpm
