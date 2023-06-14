SUMMARY = "Python module to communicate with mobile phones"
DESCRIPTION = "This provides gammu module, that can work with any phone Gammu \
supports - many Nokias, Siemens, Alcatel, ..."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "python311-python-gammu-3.2.4-1.9.aarch64.rpm"
RPM_HASH = "ba900c12cfe2627dd0ce290317ee960dcd9941437a681faddf7654e5d1c337c604cf78a123d1827eb183019a8c78b5ed339d21d8e0873b47fd5aba3dcb976c69"

RPROVIDES:${PN} += "python3.11dist-python-gammu \
python311-gammu \
python311-python-gammu \
python3dist-python-gammu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGammu.so.8 \
libc.so.6 \
libgsmsd.so.8 \
python-abi"

inherit rpm
