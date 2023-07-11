SUMMARY = "Data for Psi+"
DESCRIPTION = "Icons, sounds, and themes for Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-data-1.5.1615+0-3.2.noarch.rpm"
RPM_HASH = "0d4f17d64d832abca3bab456e12aa9237b29c77b5761e757f07409bb82cb588e1e2a11ebc35d03514f8e7c961f4360242737bad01942d181866826ee844c3640"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "psi+-data \
psi+-icons \
psi+-sounds \
psi+-themes"

RDEPENDS:${PN} += ""

inherit rpm
