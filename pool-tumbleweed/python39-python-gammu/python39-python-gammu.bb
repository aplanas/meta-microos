SUMMARY = "Python module to communicate with mobile phones"
DESCRIPTION = "This provides gammu module, that can work with any phone Gammu \
supports - many Nokias, Siemens, Alcatel, ..."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "python39-python-gammu-3.2.4-1.11.aarch64.rpm"
RPM_HASH = "e2955afde55ee5a2132c63a92d30216be938469a1e7d35f01af252b15d3bef704dcde8bc80e66ddb230fc8e1121d63fa22c3c0e9acbfacca90a6e5f3e30a9a06"

RPROVIDES:${PN} += "python3.9dist-python-gammu \
python39-gammu \
python39-python-gammu \
python3dist-python-gammu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGammu.so.8 \
libc.so.6 \
libgsmsd.so.8 \
python-abi"

inherit rpm
