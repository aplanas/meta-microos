SUMMARY = "Python module to communicate with mobile phones"
DESCRIPTION = "This provides gammu module, that can work with any phone Gammu \
supports - many Nokias, Siemens, Alcatel, ..."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "python310-python-gammu-3.2.4-1.11.aarch64.rpm"
RPM_HASH = "65ec2327aeac7a4b035072ce16858678cc471f9d0e5471e9bde9dddd94c1337314a6ddb7f755abda2c45875d96e61a5aebbe15823ff82124924ac961aaf3d362"

RPROVIDES:${PN} += "python3.10dist-python-gammu \
python310-gammu \
python310-python-gammu \
python3dist-python-gammu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGammu.so.8 \
libc.so.6 \
libgsmsd.so.8 \
python-abi"

inherit rpm
