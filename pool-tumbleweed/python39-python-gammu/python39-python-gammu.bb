SUMMARY = "Python module to communicate with mobile phones"
DESCRIPTION = "This provides gammu module, that can work with any phone Gammu \
supports - many Nokias, Siemens, Alcatel, ..."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.4"

RPM_NAME = "python39-python-gammu-3.2.4-1.9.aarch64.rpm"
RPM_HASH = "94a369475aabd57a40c84d070a4b66f8cbcc3878b559c5900be082a5808b14ee1cf095744087512f1462fa1c83c659a68b78c5b2937334528f67821c3e7d6467"

RPROVIDES:${PN} += "python3.9dist(python-gammu) \
python39-gammu \
python39-python-gammu \
python39-python-gammu(aarch-64) \
python3dist(python-gammu)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGammu.so.8()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgsmsd.so.8()(64bit) \
python(abi)"

inherit rpm
