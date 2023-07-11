SUMMARY = "Extra themes for the Aisleriot solitaire card game program"
DESCRIPTION = "Aisleriot is a compilation of 80 different solitaire card games. \
 \
This package provides extra themes for Aisleriot."
LICENSE = "GPL-3.0-or-later"

PV = "3.22.29"

RPM_NAME = "aisleriot-themes-3.22.29-1.2.noarch.rpm"
RPM_HASH = "bd08e0e30a1820c153b44fbf78a5b8e4f533400d94d6be61fe77c318ba05e1bbb69879c90feca28d00305585a812eb9475fd6b5f3d3dcfee3168b5080e043112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aisleriot-themes"

RDEPENDS:${PN} += "aisleriot"

inherit rpm
