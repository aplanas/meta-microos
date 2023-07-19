SUMMARY = "GTK4 backends for python39-matplotlib"
DESCRIPTION = "This package includes the GTK4-based gtk4, gtk4agg, and \
gtk4cairo backends for the python39-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python39-matplotlib-gtk4-3.6.3-3.1.aarch64.rpm"
RPM_HASH = "04828c75d89100952c08f72197aed6a283c1b4a653fb13ccd16d4911f2ab604ad67e10df1636f85e8a8cf5af6bbceda5cba01865d8d6d236b01f3f9b3b2bdc89"

RPROVIDES:${PN} += "python39-matplotlib-gtk4"

RDEPENDS:${PN} += "python-abi \
python39-matplotlib \
python39-matplotlib-gtk-common"

inherit rpm
