SUMMARY = "Displays the status of watson"
DESCRIPTION = "Displays the status of watson (time-tracking tool)."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-watson-2.1.5-3.3.noarch.rpm"
RPM_HASH = "d311244b7c8f3457a62b41b77437e448069f1bc4cd4f646515241f2f6246f82099fae5054b55bc823ffdbfba2033011b3ca321253c647d4370de62923f5aa7ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-watson"
RDEPENDS:${PN} += "bumblebee-status watson"

inherit rpm
