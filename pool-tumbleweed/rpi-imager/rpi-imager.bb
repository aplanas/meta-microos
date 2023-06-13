SUMMARY = "Raspberry Pi Imaging Utility"
DESCRIPTION = " \
Raspberry Pi Imager is the quick and easy way to install Raspberry Pi OS and other operating systems to a microSD card, ready to use with your Raspberry Pi. Watch our 45-second video to learn how to install an operating system using Raspberry Pi Imager. \
 \
Download and install Raspberry Pi Imager to a computer with an SD card reader. Put the SD card you'll use with your Raspberry Pi into the reader and run Raspberry Pi Imager."
LICENSE = "Apache-2.0"

PV = "1.7.4"

RPM_NAME = "rpi-imager-1.7.4-2.1.aarch64.rpm"
RPM_HASH = "10c67a9a34c6024e2ee2d1eae9ad15114425e8329f37aa5a85d5af8a9c0bbf81d8e287dbeef4347a14d171d41334d89c05acccff653197b29282adb04ee80657"

RPROVIDES:${PN} += "application() \
application(rpi-imager.desktop) \
metainfo() \
metainfo(rpi-imager.metainfo.xml) \
rpi-imager \
rpi-imager(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libarchive.so.13()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
