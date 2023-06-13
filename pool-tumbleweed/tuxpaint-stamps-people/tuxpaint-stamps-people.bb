SUMMARY = "People stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-people package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-people-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "35a32eb5cf731f7f3316f8b359263e6ce0d4df6c704c0276b45c097aa2ae3b5df629a40273b536c470522b67ae5aed3c0d3455644cfc63d2c0ea8b8e997ec599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-people"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
