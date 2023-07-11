SUMMARY = "Config library of fcitx4"
DESCRIPTION = "Config library of fcitx"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "libfcitx-config4-4.2.9.9-1.6.aarch64.rpm"
RPM_HASH = "ccfe68b425cacc55eb2b51638fb95d1f6f700e019ba2adcef45b203c37020da309cfe9e83e364b75ab4cd3540ecc4ee410a5ee33c60a856a01c71ce8d6b7e633"

RPROVIDES:${PN} += "libfcitx-config.so.4 \
libfcitx-config4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-utils.so.0"

inherit rpm
