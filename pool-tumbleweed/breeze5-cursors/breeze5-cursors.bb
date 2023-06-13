SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze cursor theme."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.5"

RPM_NAME = "breeze5-cursors-5.27.5-1.1.noarch.rpm"
RPM_HASH = "e832d637aea48465767120be19a94a54c8b3b922cbb90b8863d198492b5fa06e559f90f97594ecb60c19437bcc97447b310e4e9cffc20fa4140897f1a27dc502"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "breeze5-cursors"

RDEPENDS:${PN} += ""

inherit rpm
