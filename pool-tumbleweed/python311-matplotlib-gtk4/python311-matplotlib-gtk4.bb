SUMMARY = "GTK4 backends for python311-matplotlib"
DESCRIPTION = "This package includes the GTK4-based gtk4, gtk4agg, and \
gtk4cairo backends for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-gtk4-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "4f7a89e5430a7f03dbce0ffb0d06d7ba0caa21195faa41a81e4f72fda890ee410693cc93637a5f4c38612e622bd0fe9689991f208af32cfe7fae15f1af507257"

RPROVIDES:${PN} += "python3-matplotlib-gtk4 \
python311-matplotlib-gtk4"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-matplotlib-gtk-common"

inherit rpm
