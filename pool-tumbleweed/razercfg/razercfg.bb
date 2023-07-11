SUMMARY = "A Razer device configuration tool"
DESCRIPTION = "Razercfg is the next generation Razer device configuration \
tool bringing the Razer gaming experience to the free Open Source world. \
Including commandline tool (razercfg) and QT GUI qrazercfg."
LICENSE = "GPL-2.0-or-later & CC-BY-SA-4.0"

PV = "0.42"

RPM_NAME = "razercfg-0.42-2.9.aarch64.rpm"
RPM_HASH = "921f55837c260f80e941a17f04c4fb97f6a97fc8a081df7974fb7b4504477dc7f872e0bad7d663cb9838719f1971604eaaa8b5a69c60ac4440a338286e18fbcc"

RPROVIDES:${PN} += "librazer.so.1 \
python3.11dist-razercfg \
python3dist-razercfg \
razercfg"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0 \
python-abi \
python3-qt5"

inherit rpm
