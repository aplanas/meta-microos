SUMMARY = "Widget for each connected screen and allows the user to enable/disable screens"
DESCRIPTION = "Shows a widget for each connected screen and allows the user to enable/disable screens."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-xrandr-2.1.5-3.3.noarch.rpm"
RPM_HASH = "312a095d559873c10eb72a00ce46f1f2f67fc085cc84705cd79d39e4b329d84cb39c2a370db9037b8b1eaac34ede627e4fa673825bab2edef146ea2463dbda89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-xrandr"
RDEPENDS:${PN} += "/usr/bin/bash \
bumblebee-status \
xrandr"

inherit rpm
