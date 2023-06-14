SUMMARY = "GTK4 backends for python39-matplotlib"
DESCRIPTION = "This package includes the GTK4-based gtk4, gtk4agg, and \
gtk4cairo backends for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-gtk4-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "065fc357d47dc0f9f0af0c3b03a3813a59978f8f3eb6983e2a4b8b65e5bd22f4efa588db26751d4ef117d618965e9ef8738fe4c6ac8172b9dec3f38df96fb749"

RPROVIDES:${PN} += "python39-matplotlib-gtk4"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-matplotlib-gtk-common"

inherit rpm
