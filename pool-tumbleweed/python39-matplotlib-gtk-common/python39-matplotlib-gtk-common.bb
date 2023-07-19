SUMMARY = "Code common for GTK3 and GTK4 backends for python39-matplotlib"
DESCRIPTION = "This package provides code common for the GTK3 and GTK4 backends \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-gtk-common-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "94c0b1ebd44e7ac4aa451a661ee5cc1134aacb74ef311bcaec1c97e8ac3c2cf8cc20e84a204ca46c0be4d2b951deb0256a8af472617211f71a401a4d0e8a8177"

RPROVIDES:${PN} += "python39-matplotlib-gtk-common"

RDEPENDS:${PN} += "gdk-pixbuf-loader-rsvg \
python-abi \
python39-gobject-Gdk \
python39-gobject-cairo \
python39-matplotlib \
python39-matplotlib-cairo"

inherit rpm
