SUMMARY = "Displays and changes the current keyboard layout"
DESCRIPTION = "Displays and changes the current keyboard layout."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-layout-2.1.5-3.3.noarch.rpm"
RPM_HASH = "7adfd71e14107f35bf6d365c1b4c91df5fa4da2878fd7ce6eb03b5744bcfedab66229ad41560f72a7eb128b3ad4511e6ddd43d61a70632a7cbe787d641481ad1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-layout"
RDEPENDS:${PN} += "bumblebee-status \
setxkbmap"

inherit rpm
