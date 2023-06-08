SUMMARY = "Displays GPU name, temperature and memory usage"
DESCRIPTION = "Displays GPU name, temperature and memory usage."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-nvidia-2.1.5-3.3.noarch.rpm"
RPM_HASH = "de9eab4a97d5b9430291e2028ae1bd2eb5764d06c50c792003f0028a6809c53dbdf01c1bafc3a56bf2d82671182a531bd0d215b6c761bb604f1a876422b8750e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-nvidia"
RDEPENDS:${PN} += "bumblebee-status"

inherit rpm
