SUMMARY = "Login manager user avatars"
DESCRIPTION = "This package provides user avatars to be used by display managers"
LICENSE = "GPL-2.0-or-later"

PV = "44.2"

RPM_NAME = "gnome-control-center-user-faces-44.2-1.1.noarch.rpm"
RPM_HASH = "82452113ac98018d895e85c8a9d077eb1d04162171a569882f9d5904a3a48dc9a2b7b3fe3c79ad3306b7708ca1afd2a6e6695fba99b1b3675a416879678d528e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-user-faces"

RDEPENDS:${PN} += ""

inherit rpm
