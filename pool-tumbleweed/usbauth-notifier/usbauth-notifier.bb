SUMMARY = "Notifier for USB Firewall to use with desktop environments"
DESCRIPTION = "A notifier for the usbauth firewall against BadUSB attacks. The user could manually allow or deny USB devices."
LICENSE = "GPL-2.0-only"

PV = "1.0.4"

RPM_NAME = "usbauth-notifier-1.0.4-1.7.aarch64.rpm"
RPM_HASH = "bae717c863421c7992e229cb11f11737565a71e445426eaea491ef96f4554bc80b0a0681e71eb345fdcaa6d0bc1c7c7e22c8cbf3c0bb39ee77b97c68ed11f8e7"

RPROVIDES:${PN} += "usbauth-notifier"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnotify.so.4 \
libudev.so.1 \
libusbauth-configparser.so.1 \
permissions \
usbauth"

inherit rpm
