SUMMARY = "An input completion utility"
DESCRIPTION = "Ibus-typing-booster is a context sensitive completion \
input method to speedup typing."
LICENSE = "GPL-3.0-or-later"

PV = "2.23.4"

RPM_NAME = "ibus-typing-booster-2.23.4-1.1.aarch64.rpm"
RPM_HASH = "c2967353c1622ce730416015fb091ac32eda22d096914fb6bc6b4012eca42e747f315769c7c463975c3f97ccb0abac3cecc15e4b29a1720350d199e77de94f1c"

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
