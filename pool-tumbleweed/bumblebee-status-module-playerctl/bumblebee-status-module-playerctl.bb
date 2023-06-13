SUMMARY = "Displays information about the current song using playerctl"
DESCRIPTION = "Displays information about the current song in \
vlc, audacious, bmp, xmms2, spotify and others."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-playerctl-2.1.5-3.3.noarch.rpm"
RPM_HASH = "b3087dea8921d7003ad90ed26adce1fe2fac800872feb7ad3508847fb03ef97927ee8607b0afa9494592ff7faed424408a369fc1f3b52f25f94caff06720205c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-playerctl"

RDEPENDS:${PN} += "bumblebee-status \
playerctl"

inherit rpm
