SUMMARY = "Python module to communicate with mobile phones"
DESCRIPTION = "This provides gammu module, that can work with any phone Gammu \
supports - many Nokias, Siemens, Alcatel, ..."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "python310-python-gammu-3.2.4-1.9.aarch64.rpm"
RPM_HASH = "e0f6dddc7450c41ddfacb7bef1278273573f5d46ee292a5ab0f9e07f012e755f009cf7db05bbff16ecacff993c1254b9f5ac23fb6e619f1c5d0447aef864ca46"

RPROVIDES:${PN} += "python3-gammu \
python3-python-gammu \
python3.10dist(python-gammu) \
python310-gammu \
python310-python-gammu \
python310-python-gammu(aarch-64) \
python3dist(python-gammu)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGammu.so.8()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgsmsd.so.8()(64bit) \
python(abi)"

inherit rpm
