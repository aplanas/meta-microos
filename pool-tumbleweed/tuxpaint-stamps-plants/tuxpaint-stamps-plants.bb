SUMMARY = "Plants stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-plants package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-plants-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "2bfacae8fe78842405b3e43cb08f3e341cd77ac50881b2ec8f575800f5e054116281c1e294d2d288b62f35a4f0feaf618561101ed505640402608cd84726be4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-plants"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
