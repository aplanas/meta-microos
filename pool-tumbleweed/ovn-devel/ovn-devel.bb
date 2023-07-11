SUMMARY = "Development files for Open Virtual Network"
DESCRIPTION = "Devel libraries and headers for Open Virtual Network."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-devel-23.03.0-14.3.aarch64.rpm"
RPM_HASH = "81015cfe7c696c671a9ae6fd73ed449af68a11644ba605a5f05fa9bd5fd8869af37ae89dbd3cb2fb3f242d6eb1fa16612a546751a5081c000c9fd4c86f11726d"

RPROVIDES:${PN} += "openvswitch-devel-/usr/include/ovn \
ovn-devel"

RDEPENDS:${PN} += "libovn-23-03-0"

inherit rpm
