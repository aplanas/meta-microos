SUMMARY = "Widget to display focused i3 window title"
DESCRIPTION = "Widget to displays focused i3 window title."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-title-2.1.5-3.3.noarch.rpm"
RPM_HASH = "2903f5a400d247906d14c1cd88856cd9d16331d41f227c8fcc0a65164074bddf7f0ded9581b1b8a9254ef79e551f2b32ba100db84ed560009091afea9581ea16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-title"
RDEPENDS:${PN} += "bumblebee-status \
python3-i3ipc"

inherit rpm
