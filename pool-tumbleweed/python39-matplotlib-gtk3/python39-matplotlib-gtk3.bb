SUMMARY = "GTK3 backends for python39-matplotlib"
DESCRIPTION = "This package includes the GTK3-based gtk3, gtk3agg, and \
gtk3cairo backends for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-gtk3-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "993fd78a43a584c863b09c75121f7be708408a4f5b470fcf9fba043d4b626b6474dc50dc86696e42c3e3479192ad191477a70c6bc9b7d2815196cab00f05d38f"

RPROVIDES:${PN} += "python39-matplotlib-gtk3"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-matplotlib-gtk-common"

inherit rpm
