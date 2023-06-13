SUMMARY = "Seasonal stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-seasonal package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-seasonal-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "efdaa69db7be86673a90c97f7bc19aeec520d8b7af1c39c76418f566a2edc273538dd2c7ba39d89bf3c0e5741d54c50f3d5a657744e534ae4da0be692fc788f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-seasonal"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
