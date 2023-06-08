SUMMARY = "Bluetooth Stack for Linux"
DESCRIPTION = "BlueZ provides support for the core Bluetooth layers and protocols."
LICENSE = "GPL-2.0-or-later"

PV = "5.66"

RPM_NAME = "bluez-5.66-1.6.aarch64.rpm"
RPM_HASH = "0a857a490668254d3c3e2d3efc4acdd997bf8a7c58993b65e188f0d6ec694bab2e33f315ea8949dddf7d8e73ef69b5cc5e77e4abd01b8b95c95fe497c1120966"

RPROVIDES:${PN} += "bluez bluez(aarch-64) bluez-audio bluez-hcidump bluez-utils obexd-client"
RDEPENDS:${PN} += "/bin/sh ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libasound.so.2()(64bit) libasound.so.2(ALSA_0.9)(64bit) libc.so.6(GLIBC_2.34)(64bit) libdbus-1.so.3()(64bit) libdbus-1.so.3(LIBDBUS_1_3)(64bit) libell.so.0()(64bit) libell.so.0(ELL_0.56)(64bit) libglib-2.0.so.0()(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libreadline.so.8()(64bit) libudev.so.1()(64bit) libudev.so.1(LIBUDEV_183)(64bit) libudev.so.1(LIBUDEV_196)(64bit) systemd"

inherit rpm
