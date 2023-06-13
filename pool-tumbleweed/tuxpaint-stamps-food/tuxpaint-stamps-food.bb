SUMMARY = "Food stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-food package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-food-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "fdba3301e83cfbdd2c049153e9bd499dd17174a5da8caa85400765162ada004b878ee303898f2c752e915384e2da41d6d7d2922b0d6472db1b2eba5c5d0f9f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-food"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
