SUMMARY = "Displays the brightness of a display"
DESCRIPTION = "Displays the brightness of a display."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-brightness-2.1.5-3.3.noarch.rpm"
RPM_HASH = "4f7d5e618105de6f0e28d642d15295e2fefc0df3a15d342db671a9cc8b53b638ffab5c143062aa0bce8b3eaa58efe6a5da3c5c07d79f6227c980498a4413144f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-brightness"

RDEPENDS:${PN} += "bumblebee-status"

inherit rpm
