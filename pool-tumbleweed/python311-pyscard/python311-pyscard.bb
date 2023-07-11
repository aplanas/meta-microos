SUMMARY = "Python module adding smart card support"
DESCRIPTION = "Python-pyscard consists of smartcard.scard, an extension module wrapping \
Windows smart card base components (also known as PCSC) on Windows and PCSC \
lite on linux and Mac OS X Tiger and Leopard, and smartcard, a higher level \
python framework built on top of the raw PCSC API."
LICENSE = "LGPL-2.0-or-later"

PV = "2.0.7"

RPM_NAME = "python311-pyscard-2.0.7-1.3.aarch64.rpm"
RPM_HASH = "0a750e70c3ab968907b24e7cd6444ff9877af9e61bc1d23895a9279b8ab020d0164f97b23e5a131605db8235aed2ad5ce2d8de7457bc7ed79c5868834fc14df3"

RPROVIDES:${PN} += "python3-pyscard \
python3.11dist-pyscard \
python311-pyscard \
python3dist-pyscard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
pcsc-ccid \
python-abi"

inherit rpm
