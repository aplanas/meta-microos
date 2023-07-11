SUMMARY = "Color profiles for colord"
DESCRIPTION = "colord is a system activated daemon that maps devices to color profiles. \
It is used by gnome-color-manager for system integration and use when \
there are no users logged in. \
 \
This package provides color profiles previously provided by shared-color-profiles"
LICENSE = "GPL-2.0-or-later"

PV = "1.4.6"

RPM_NAME = "colord-color-profiles-1.4.6-2.4.aarch64.rpm"
RPM_HASH = "3c8512d3b9c180b9360ff2df40ed60dedf647bfd6259ac3fb97f8baa699cf736d0417aaa72a691e6faec58fd651efab1b8d6acbf1209e36315eaf0bfbdfcb656"

RPROVIDES:${PN} += "colord-color-profiles \
shared-color-profiles"

RDEPENDS:${PN} += ""

inherit rpm
