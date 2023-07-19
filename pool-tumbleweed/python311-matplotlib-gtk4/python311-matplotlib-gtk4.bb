SUMMARY = "GTK4 backends for python311-matplotlib"
DESCRIPTION = "This package includes the GTK4-based gtk4, gtk4agg, and \
gtk4cairo backends for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-gtk4-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "0e61cf6c98724c35420edf5d9c728e62c160720dd7ac9ba4de9ef33c80fb5bf87b83420111ebef19f98c59425d70e06ebec22486c202b796fea6f64d950158e0"

RPROVIDES:${PN} += "python3-matplotlib-gtk4 \
python311-matplotlib-gtk4"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-matplotlib-gtk-common"

inherit rpm
