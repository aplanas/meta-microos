SUMMARY = "Code common for GTK3 and GTK4 backends for python310-matplotlib"
DESCRIPTION = "This package provides code common for the GTK3 and GTK4 backends \
for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-gtk-common-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "cfefec37e027c763a552644a422b4378abd46cd00986a91812bb9734227ad0c81a8330977efb3e88765e667ecbc5b8495dd4812835a20f4df06dab0811e33a4f"

RPROVIDES:${PN} += "python310-matplotlib-gtk-common"

RDEPENDS:${PN} += "gdk-pixbuf-loader-rsvg \
python-abi \
python310-gobject-Gdk \
python310-gobject-cairo \
python310-matplotlib \
python310-matplotlib-cairo"

inherit rpm
