SUMMARY = "Code common for GTK3 and GTK4 backends for python39-matplotlib"
DESCRIPTION = "This package provides code common for the GTK3 and GTK4 backends \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-gtk-common-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "e1837e684851515e1378ac9462e9d938b0c0204f53e709ac49a263a67b81b3b70b1f48bc25b3766e85a0a7d7ea19b8990b44148d9e54d4ac3036a25240e48ce7"

RPROVIDES:${PN} += "python39-matplotlib-gtk-common"

RDEPENDS:${PN} += "gdk-pixbuf-loader-rsvg \
python-abi \
python39-gobject-Gdk \
python39-gobject-cairo \
python39-matplotlib \
python39-matplotlib-cairo"

inherit rpm
