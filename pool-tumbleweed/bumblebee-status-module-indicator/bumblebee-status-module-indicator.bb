SUMMARY = "Widget to show status for numlock, scrolllock and capslock"
DESCRIPTION = "Displays the indicator status for numlock, scrolllock and capslock."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-indicator-2.1.5-3.3.noarch.rpm"
RPM_HASH = "c8bdd7f74e870fcd41f628d0044726abeb911d8d086787124aaa9b56f1bd9b44041ee050eac5625bc29bfd568c0bef416596831f16b431750ac709dfa90429c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-indicator"
RDEPENDS:${PN} += "bumblebee-status \
xset"

inherit rpm
