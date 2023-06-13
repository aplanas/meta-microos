SUMMARY = "Widget to show information about the current song in cmus"
DESCRIPTION = "Displays information about the current song in cmus via cmus-remote. \
 \
It takes a parameter (cmus.format) which customizes how the song \
is displayed. Tag values can be put in curly brackets, (i.e., {artist})."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-cmus-2.1.5-3.3.noarch.rpm"
RPM_HASH = "81e84280e2d3f77e4222b06184c48be999c807d22971337a48c59d05aa3f267d00f8745001360416392b33e42ca3faf27e4889d284508993804355a7f8b12eb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-cmus"

RDEPENDS:${PN} += "bumblebee-status \
cmus"

inherit rpm
