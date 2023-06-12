SUMMARY = "Control the alsa volume"
DESCRIPTION = "Get volume level or control it."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-alsa-2.1.5-3.3.noarch.rpm"
RPM_HASH = "6b73dd71a97440d02f8dbae080095c5491722ee7932934a42e7ab114bca1f1dd0aac74e3585adfe162b713c2a820699139fe07fbad8783c1c4e7352635b88519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-alsa"
RDEPENDS:${PN} += "alsa-utils \
bumblebee-status"

inherit rpm
