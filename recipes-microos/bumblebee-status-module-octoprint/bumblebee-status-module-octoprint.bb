SUMMARY = "Displays Octoprint status"
DESCRIPTION = "Displays the Octoprint status and the printer's bed/tools temperature in the status bar."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-octoprint-2.1.5-3.3.noarch.rpm"
RPM_HASH = "6515f6ce23d022dbecc4073e5868a8648108f27ae3d1c85622ff4754b003ae5b1bb3840e658c397aabb7928a9df257a713701ef4cea0d06e3a4021940f7790f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-octoprint"
RDEPENDS:${PN} += "bumblebee-status python3-Pillow-tk python3-simplejson"

inherit rpm
