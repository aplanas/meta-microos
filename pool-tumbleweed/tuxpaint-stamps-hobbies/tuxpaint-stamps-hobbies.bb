SUMMARY = "Hobbies stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-hobbies package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2021.11.25"

RPM_NAME = "tuxpaint-stamps-hobbies-2021.11.25-1.5.noarch.rpm"
RPM_HASH = "468607e20f272725621943f24e2d9b04a90c376dad0ceafd2f07177512aa56ecebc3f9bec8edbc955c35012755fcc743fb8b10080c5e8539e63d59d7116b8701"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-hobbies"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
