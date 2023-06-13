SUMMARY = "Radiance Gtk Theme -- Common Files"
DESCRIPTION = "Includes an Radiance dark-on-light theme. \
 \
Introduced as one of the defaults in Ubuntu 10.04 LTS."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "metatheme-radiance-common-20.10-2.2.noarch.rpm"
RPM_HASH = "dbc942e834dc47bf0d247277c81cf697bd81c96761bf1b45e2384f6006d3f7057b071ad40d88991c50dfbbf5c7a694f55dd976c1bbb6d955cbb498f0f9d20497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-radiance-common"

RDEPENDS:${PN} += ""

inherit rpm
