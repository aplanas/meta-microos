SUMMARY = "GTK4 backends for python39-matplotlib"
DESCRIPTION = "This package includes the GTK4-based gtk4, gtk4agg, and \
gtk4cairo backends for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-gtk4-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "4b8b02070a2e580305d508cac0142f7ce1e8dddb68e7c55542b22a99caba4b781137c7d6103ade4962d473632b83983e8d7ad25359eeb68b3eb9f96f0b0eecdf"

RPROVIDES:${PN} += "python39-matplotlib-gtk4"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-matplotlib-gtk-common"

inherit rpm
