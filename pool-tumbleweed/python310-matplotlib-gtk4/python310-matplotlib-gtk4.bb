SUMMARY = "GTK4 backends for python310-matplotlib"
DESCRIPTION = "This package includes the GTK4-based gtk4, gtk4agg, and \
gtk4cairo backends for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-gtk4-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "3f865ab63f73e87ee8e359caa388a1d51c9da72686d4bd3e204f1e1dcc8143dcb71a2241f5979d323125b407c551994c898236f91d30150d19147570558dd8b7"

RPROVIDES:${PN} += "python310-matplotlib-gtk4"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-matplotlib-gtk-common"

inherit rpm
