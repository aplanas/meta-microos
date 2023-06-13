SUMMARY = "A Razer device configuration tool"
DESCRIPTION = "Razercfg is the next generation Razer device configuration \
tool bringing the Razer gaming experience to the free Open Source world. \
Including commandline tool (razercfg) and QT GUI qrazercfg."
LICENSE = "GPL-2.0-or-later & CC-BY-SA-4.0"

PV = "0.42"

RPM_NAME = "razercfg-0.42-2.8.aarch64.rpm"
RPM_HASH = "bb4ac3a4521ba3163ff51c859267fa0edd70dfd253ea12981cd286126ed50af280de65ead0b20c729c6c5ddd90a104db55e5587299e7b63892deb9387d85a967"

RPROVIDES:${PN} += "application() \
application(razercfg.desktop) \
librazer.so.1()(64bit) \
python3.10dist(razercfg) \
python3dist(razercfg) \
razercfg \
razercfg(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libusb-1.0.so.0()(64bit) \
python(abi) \
python3-qt5"

inherit rpm
