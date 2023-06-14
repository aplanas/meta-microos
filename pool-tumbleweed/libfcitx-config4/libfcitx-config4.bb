SUMMARY = "Config library of fcitx4"
DESCRIPTION = "Config library of fcitx"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "libfcitx-config4-4.2.9.9-1.5.aarch64.rpm"
RPM_HASH = "815816076f22f505814e37434b36f7b9bbde8e05639806bb18fcba8f1adb7f58954c178b68e2469d77ac8d1a7cbe6fee22adbb14626f4bdf5e31ec310190cf07"

RPROVIDES:${PN} += "libfcitx-config.so.4 \
libfcitx-config4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-utils.so.0"

inherit rpm
