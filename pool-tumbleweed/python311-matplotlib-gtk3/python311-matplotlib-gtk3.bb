SUMMARY = "GTK3 backends for python311-matplotlib"
DESCRIPTION = "This package includes the GTK3-based gtk3, gtk3agg, and \
gtk3cairo backends for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-gtk3-3.6.3-2.3.aarch64.rpm"
RPM_HASH = "e4d295e8aff4479fdc037f7e3e1fb29dee8b55a87be1343d9c90186d377583e54ae13c1f5018e41f69bc47501fb0eaa78ea46c11a648c6da3d21294ced3c73d8"

RPROVIDES:${PN} += "python3-matplotlib-gtk3 \
python311-matplotlib-gtk3"

RDEPENDS:${PN} += "python-abi \
python311-matplotlib \
python311-matplotlib-gtk-common"

inherit rpm
