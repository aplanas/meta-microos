SUMMARY = "An input completion utility"
DESCRIPTION = "Ibus-typing-booster is a context sensitive completion \
input method to speedup typing."
LICENSE = "GPL-3.0-or-later"

PV = "2.22.5"

RPM_NAME = "ibus-typing-booster-2.22.5-1.1.aarch64.rpm"
RPM_HASH = "7965dc9f74562a9866b8270b37cdc202e22efc9c84f8d98260d3bc8ab1615e7a1d16c4ed07666e04bfa33940e38f3c222ddb25b365fa65c0505b2cc5d26b718e"

RPROVIDES:${PN} += "application() \
application(emoji-picker.desktop) \
application(ibus-setup-typing-booster.desktop) \
ibus-typing-booster \
ibus-typing-booster(aarch-64) \
metainfo() \
metainfo(emoji-picker.appdata.xml) \
metainfo(typing-booster.appdata.xml)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/sh \
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
