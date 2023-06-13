SUMMARY = "Customize IBus extension for GNOME Shell"
DESCRIPTION = "Full customization of appearance, behavior, system tray and input source indicator for IBus. \
深度定制 IBus 的外观、行为、系统托盘以及输入指示。"
LICENSE = "GPL-3.0-or-later"

PV = "86"

RPM_NAME = "gnome-shell-extension-customize-ibus-86-1.1.noarch.rpm"
RPM_HASH = "38823f3d5b4fc90237de87f921c1c3e47f249ecb265565c86ad13c5294f6d1d44d4339ee714fc1db80f538504d1713c3bbab5a2db597db897d3549408e08a11a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-extension-customize-ibus"

RDEPENDS:${PN} += "gnome-shell \
gnome-tweaks"

inherit rpm
