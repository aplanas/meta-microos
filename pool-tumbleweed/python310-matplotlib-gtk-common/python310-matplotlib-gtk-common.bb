SUMMARY = "Code common for GTK3 and GTK4 backends for python310-matplotlib"
DESCRIPTION = "This package provides code common for the GTK3 and GTK4 backends \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-gtk-common-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "71075692713527d114fd054c0cb7eeb5b7663a23b30c45a11a124c9a3d538112481354eff9f44a538122a67dc4f663b0e6e6bfd8a01240a91925c1d5dfcfbd39"

RPROVIDES:${PN} += "python310-matplotlib-gtk-common"

RDEPENDS:${PN} += "gdk-pixbuf-loader-rsvg \
python-abi \
python310-gobject-Gdk \
python310-gobject-cairo \
python310-matplotlib \
python310-matplotlib-cairo"

inherit rpm
