SUMMARY = "GTK3 backends for python310-matplotlib"
DESCRIPTION = "This package includes the GTK3-based gtk3, gtk3agg, and \
gtk3cairo backends for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-gtk3-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "4acd3c82537d7c41aaad109941108b4db0f0f7d276c5cdf45db3d8335cf5d824fef651cbea38c7086c29b747095f0058dd7b972a3e5112c4470c77d45ab780b4"

RPROVIDES:${PN} += "python3-matplotlib-gtk3 \
python310-matplotlib-gtk3"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-matplotlib-gtk-common"

inherit rpm
