SUMMARY = "Activity files for gcompris-qt"
DESCRIPTION = "This package contains the bundle of activities for gcompris-qt. \
More than 100 activities are available."
LICENSE = "AGPL-3.0-or-later"

PV = "3.2"

RPM_NAME = "gcompris-qt-activities-3.2-1.1.noarch.rpm"
RPM_HASH = "220e08d18f08b4b29c4516c2879132003ea2b864fd0d0d4e202b02b5e20ba3c90f76e38f63fef66c464fb7d2aee2b2061c563074cb3ec2476f7128653aa5ea9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcompris-qt-activities"
RDEPENDS:${PN} += "gcompris-qt"

inherit rpm
