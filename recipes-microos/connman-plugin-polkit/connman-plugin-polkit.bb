SUMMARY = "PolicyKit plugin for connman"
DESCRIPTION = "Provides PolicyKit support for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.41"

RPM_NAME = "connman-plugin-polkit-1.41-4.7.aarch64.rpm"
RPM_HASH = "507c225fbed5a236d836c6e5ef2bbf8dacb6d1df4098becb843a14409399396fe72700004614594e118b929e53833db37520f419bb8722de4f3d33720118887e"

RPROVIDES:${PN} += "connman-plugin-polkit \
connman-plugin-polkit(aarch-64)"
RDEPENDS:${PN} += "connman \
dbus-1 \
polkit"

inherit rpm
