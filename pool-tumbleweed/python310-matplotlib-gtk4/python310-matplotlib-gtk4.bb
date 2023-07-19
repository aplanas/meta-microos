SUMMARY = "GTK4 backends for python310-matplotlib"
DESCRIPTION = "This package includes the GTK4-based gtk4, gtk4agg, and \
gtk4cairo backends for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-gtk4-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "0e6c0707ff614c4b1e0fd394f634ecdff55c2b09b616a950fc7c2d6241c4d261852621aab28f28446f7c540b1c76c048c0d7eb0eb2bc70b7c914feab072d7606"

RPROVIDES:${PN} += "python310-matplotlib-gtk4"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-matplotlib-gtk-common"

inherit rpm
