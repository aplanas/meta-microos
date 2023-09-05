SUMMARY = "An input completion utility"
DESCRIPTION = "Ibus-typing-booster is a context sensitive completion \
input method to speedup typing."
LICENSE = "GPL-3.0-or-later"

PV = "2.24.0"

RPM_NAME = "ibus-typing-booster-2.24.0-1.1.aarch64.rpm"
RPM_HASH = "7198bf6ed145e8d176b1d73b4d71bdf1bd1bcba2f917ae4f9f7736885eb61951e0496e86087d74e528a43e8d877e042845b18cefcf3923763529f80775935a0c"

RPROVIDES:${PN} += "ibus-typing-booster"

RDEPENDS:${PN} += "/usr/bin/sh \
dbus-1-python3 \
enchant-1-backend \
ibus \
m17n-lib \
python3 \
python3-distro \
python3-packaging \
python3-pyenchant \
python3-pyxdg"

inherit rpm
