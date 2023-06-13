SUMMARY = "Enables handy interaction with arandr for display management"
DESCRIPTION = "Enables handy interaction with arandr for display management."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-arandr-2.1.5-3.3.noarch.rpm"
RPM_HASH = "b40dc266911854e15c201b5eb7d89fa646ebc37a3f260cbbc40f79d497ac026020677f26074c7a9094007e7d1814b8ce95dfbb1b8a8ed01f43cbb81825f15977"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-arandr"

RDEPENDS:${PN} += "arandr \
bumblebee-status"

inherit rpm
