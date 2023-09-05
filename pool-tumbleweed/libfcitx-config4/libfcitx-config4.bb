SUMMARY = "Config library of fcitx4"
DESCRIPTION = "Config library of fcitx"
LICENSE = "GPL-2.0-or-later"

PV = "4.2.9.9"

RPM_NAME = "libfcitx-config4-4.2.9.9-2.1.aarch64.rpm"
RPM_HASH = "7c371ded3210b5da55ff119408e6b5ab45955d9b45ba5cc80c86debdf98de19fb836a9888823196b74088100b4498a6c219778c450b06c7874bea134cb76227a"

RPROVIDES:${PN} += "libfcitx-config.so.4 \
libfcitx-config4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfcitx-utils.so.0"

inherit rpm
