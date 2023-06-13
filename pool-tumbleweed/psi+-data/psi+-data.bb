SUMMARY = "Data for Psi+"
DESCRIPTION = "Icons, sounds, and themes for Psi+."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.1615+0"

RPM_NAME = "psi+-data-1.5.1615+0-3.1.noarch.rpm"
RPM_HASH = "ac09fa5312de2a95f9fdf7e1344ae2166c35b6e7f73a38d45f3d9bf8c83d7ca1f25c91441ed0b0036bbabef9f683d8932e2525dbb773cf6ac7c7114196b735f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "psi+-data \
psi+-icons \
psi+-sounds \
psi+-themes"

RDEPENDS:${PN} += ""

inherit rpm
