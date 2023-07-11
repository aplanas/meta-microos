SUMMARY = "Common files used by the different Virtual Machine Manager interfaces"
DESCRIPTION = "Common files used by the different virt-manager interfaces, as well as \
virt-install related tools."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "virt-manager-common-4.1.0-9.1.noarch.rpm"
RPM_HASH = "2c6f58278ac52e38ecd90632944af467306fc48ce8848088674c6c3d6cf212f17902b3eac0bec254cafdbf8f2d6fc909d834009a4419600e0c5d2cf56bd51d3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "virt-manager-common"

RDEPENDS:${PN} += "libosinfo \
mkisofs \
python3-gobject \
python3-ipaddr \
python3-libvirt-python \
python3-libxml2-python \
python3-pycurl \
typelib-AppIndicator3 \
typelib-Libosinfo \
typelib-LibvirtGLib \
xorriso"

inherit rpm
