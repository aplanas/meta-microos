SUMMARY = "Data files for extreme-tuxracer"
DESCRIPTION = "This package contains the data files for extreme-tuxracer."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.2"

RPM_NAME = "extreme-tuxracer-data-0.8.2-1.6.noarch.rpm"
RPM_HASH = "c242d2d2577045c25877d44fd66d5f3f1aa64fa615c3d797767fa39c323f098216ec66510ee0aa382b68930c6f0abbcf2e7efc29c08d316ee8b802149495fdbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extreme-tuxracer-data"

RDEPENDS:${PN} += ""

inherit rpm
