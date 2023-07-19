SUMMARY = "Code common for GTK3 and GTK4 backends for python311-matplotlib"
DESCRIPTION = "This package provides code common for the GTK3 and GTK4 backends \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-gtk-common-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "fa457114211329d6ff1ff3ec3ce1581f1eb14b06e00e300b85447f46f5310941b231aee2c380ff5b4a295903069f58e9964c2c612ef754d3eb62a84fccb9aa37"

RPROVIDES:${PN} += "python3-matplotlib-gtk-common \
python311-matplotlib-gtk-common"

RDEPENDS:${PN} += "gdk-pixbuf-loader-rsvg \
python-abi \
python311-gobject-Gdk \
python311-gobject-cairo \
python311-matplotlib \
python311-matplotlib-cairo"

inherit rpm
