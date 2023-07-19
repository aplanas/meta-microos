SUMMARY = "GTK3 backends for python310-matplotlib"
DESCRIPTION = "This package includes the GTK3-based gtk3, gtk3agg, and \
gtk3cairo backends for the python310-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python310-matplotlib-gtk3-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "6073022b197e174eb1574dd7af548a2636be3b3e7944eb446c09f4ca734a2271ef1a43530bd5b9dc1e666b3f57291ca325a6b0537f34471e6dad72b0a980f83a"

RPROVIDES:${PN} += "python310-matplotlib-gtk3"

RDEPENDS:${PN} += "python-abi \
python310-matplotlib \
python310-matplotlib-gtk-common"

inherit rpm
