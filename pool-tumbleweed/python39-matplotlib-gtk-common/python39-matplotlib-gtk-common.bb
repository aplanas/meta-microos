SUMMARY = "Code common for GTK3 and GTK4 backends for python39-matplotlib"
DESCRIPTION = "This package provides code common for the GTK3 and GTK4 backends \
for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-gtk-common-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "95f70620ae473017b9844f5f4fa543a6da2b3b653aa40d6c72af4f9b3f653a21977cf37fd765c582d0262709d7310ebb8f88e4ea8926e9d20e62f8664baaeedf"

RPROVIDES:${PN} += "python39-matplotlib-gtk-common"

RDEPENDS:${PN} += "gdk-pixbuf-loader-rsvg \
python-abi \
python39-gobject-Gdk \
python39-gobject-cairo \
python39-matplotlib \
python39-matplotlib-cairo"

inherit rpm
