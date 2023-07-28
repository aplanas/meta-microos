SUMMARY = "Zoom in/out of windows (toggle between one window and multi-window)"
DESCRIPTION = "The idea is to make it easy to zoom into and out of a window. \
Usage: \
 \
     Press <c-w>o : the current window zooms into a full screen \
     Press <c-w>o again: the previous set of windows is restored"
LICENSE = "Vim"

PV = "24"

RPM_NAME = "vim-plugin-zoomwin-24-56.1.noarch.rpm"
RPM_HASH = "15dc48d255d09932b35d63ff108ca165960436dbb4f745a62c5ef074ce14e9415e16c5f0a9d47607428a397ac4b905835c3090471875439e0f932711174c06ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vim-plugin-zoomwin"

RDEPENDS:${PN} += "/usr/bin/sh \
vim"

inherit rpm
