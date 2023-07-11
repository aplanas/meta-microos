SUMMARY = "Python module adding smart card support"
DESCRIPTION = "Python-pyscard consists of smartcard.scard, an extension module wrapping \
Windows smart card base components (also known as PCSC) on Windows and PCSC \
lite on linux and Mac OS X Tiger and Leopard, and smartcard, a higher level \
python framework built on top of the raw PCSC API."
LICENSE = "LGPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "python310-pyscard-2.0.7-1.3.aarch64.rpm"
RPM_HASH = "8e143a78677b344724cc509c5af9ca45f9ebadf9be45198d99cf085e83eacaec5814f7a0374cdcee20b0af45be1faba587524ac8abfb34ce3f9ad6926bc77288"

RPROVIDES:${PN} += "python3.10dist-pyscard \
python310-pyscard \
python3dist-pyscard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pcsc-ccid \
python-abi"

inherit rpm
