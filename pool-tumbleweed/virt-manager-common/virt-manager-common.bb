SUMMARY = "Common files used by the different Virtual Machine Manager interfaces"
DESCRIPTION = "Common files used by the different virt-manager interfaces, as well as \
virt-install related tools."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "virt-manager-common-4.1.0-10.1.noarch.rpm"
RPM_HASH = "d90368bb615d4274f30cc3928498c4bfe61b794d792608a5da5ae73465d7294c799801333a428ca42f3b3ad0529fef7c3eadd9919e149873fc03cf7e4853a0af"
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
