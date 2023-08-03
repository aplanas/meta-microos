SUMMARY = "An input completion utility"
DESCRIPTION = "Ibus-typing-booster is a context sensitive completion \
input method to speedup typing."
LICENSE = "GPL-3.0-or-later"

PV = "2.23.2"

RPM_NAME = "ibus-typing-booster-2.23.2-1.1.aarch64.rpm"
RPM_HASH = "6ee8749e739ed2f1ac48a7edc7694e727d2ad2a1fe6b0a33d95542a843aadc1487cf054b156e565889cc710de2ef2a38e45c7809e15ceb994d2f25eb007aebfc"

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
