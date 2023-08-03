SUMMARY = "A GTK3 wrapper to display text on the desktop for wlroots"
DESCRIPTION = " \
nwg-displays is Output management utility for sway Wayland compositor, \
inspired by wdisplays and wlay."
LICENSE = "MIT"

PV = "0.3.7"

RPM_NAME = "nwg-displays-0.3.7-1.1.noarch.rpm"
RPM_HASH = "6e324273c89cb29b8cc85d799dc34c02a5eeef659e688b9febe598cb4454cf115888c0703554bff7d468b443493dc553cd2e351766a80857403d27df632a8080"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nwg-displays \
python3.11dist-nwg-displays \
python3dist-nwg-displays"

RDEPENDS:${PN} += "/usr/bin/python3 \
libgtk-3-0 \
libgtk-layer-shell0 \
python-abi \
python3-gobject \
python3-i3ipc \
typelib-1-0-GtkLayerShell-0-1"

inherit rpm
