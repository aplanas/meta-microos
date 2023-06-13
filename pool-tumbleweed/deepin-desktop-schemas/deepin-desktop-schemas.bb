SUMMARY = "GSettings deepin desktop-wide schemas"
DESCRIPTION = "deepin-desktop-schemas contains a collection of GSettings schemas for \
settings shared by various components of a desktop."
LICENSE = "GPL-3.0-or-later"

PV = "5.10.11"

RPM_NAME = "deepin-desktop-schemas-5.10.11-2.1.noarch.rpm"
RPM_HASH = "2c9ab9aed4b81171d3aade2dd6b2da766f78150710449d80d771028d610fd0bd47bb0c6d1831b0845b28eb6e4eeb4191ef4bba59494faf1fd058f6d6668bb699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-desktop-schemas"

RDEPENDS:${PN} += "dconf"

inherit rpm
