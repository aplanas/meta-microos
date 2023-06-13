SUMMARY = "Code common for GTK3 and GTK4 backends for python310-matplotlib"
DESCRIPTION = "This package provides code common for the GTK3 and GTK4 backends \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-gtk-common-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "94ea6dfa3df3e967a82a879b5ef3aad5d12477702009bf044f6962ea26d30b6d82cd39f76e9c838e20064911cb61cd1ba3181459fd3cfdb05137c0beca4cb24a"

RPROVIDES:${PN} += "python3-matplotlib-gtk-common \
python310-matplotlib-gtk-common \
python310-matplotlib-gtk-common(aarch-64)"

RDEPENDS:${PN} += "gdk-pixbuf-loader-rsvg \
python(abi) \
python310-gobject-Gdk \
python310-gobject-cairo \
python310-matplotlib \
python310-matplotlib-cairo"

inherit rpm
