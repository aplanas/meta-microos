SUMMARY = "Activity files for gcompris-qt"
DESCRIPTION = "This package contains the bundle of activities for gcompris-qt. \
More than 100 activities are available."
LICENSE = "AGPL-3.0-or-later"

PV = "3.3"

RPM_NAME = "gcompris-qt-activities-3.3-1.1.noarch.rpm"
RPM_HASH = "66df07f51d3f6d6372d0f07cbbe5a83fe30a69d1bb16de0278bd807e67068f2b7ca7b381836ca1dfbbb1f305b6bbc8ebcc70ff758ba9c5849a7e04d3d3889d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcompris-qt-activities"

RDEPENDS:${PN} += "gcompris-qt"

inherit rpm
