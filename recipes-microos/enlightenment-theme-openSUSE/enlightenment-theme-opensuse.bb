SUMMARY = "openSUSE theme for Enlightenment"
DESCRIPTION = "openSUSE, theme for Enlightenment"
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220430.1.26"

RPM_NAME = "enlightenment-theme-openSUSE-20220430.1.26-1.9.noarch.rpm"
RPM_HASH = "cc7132e3dda19658847b01d009d0c071a36eb64ed1e9568631dffb3236ddaa33d51f5f7601045476ef237eda8131cd6732b5a36bc5b5cab5ecd69d5ff45fadda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme enlightenment-theme-dft enlightenment-theme-openSUSE"
RDEPENDS:${PN} += "elementary"

inherit rpm
