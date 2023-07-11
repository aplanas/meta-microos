SUMMARY = "Python module to communicate with mobile phones"
DESCRIPTION = "This provides gammu module, that can work with any phone Gammu \
supports - many Nokias, Siemens, Alcatel, ..."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "python311-python-gammu-3.2.4-1.11.aarch64.rpm"
RPM_HASH = "3c33f752e61b710efdc081fea175c8dedf068244170364749b9e1688ede60329a2f6ab63a26281ac7d07b65a4178bb9d1bd18f889cd3464bf3f2f5c5624271fb"

RPROVIDES:${PN} += "python3-gammu \
python3-python-gammu \
python3.11dist-python-gammu \
python311-gammu \
python311-python-gammu \
python3dist-python-gammu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGammu.so.8 \
libc.so.6 \
libgsmsd.so.8 \
python-abi"

inherit rpm
