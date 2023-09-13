SUMMARY = "Development files for Open Virtual Network"
DESCRIPTION = "Devel libraries and headers for Open Virtual Network."
LICENSE = "Apache-2.0"

PV = "23.03.0"

RPM_NAME = "ovn-devel-23.03.0-15.1.aarch64.rpm"
RPM_HASH = "2ea76bc81afe55e667b738682482c98ca627b1c6580d201c71716fc762d2d5e6a0b9967f3c6f0f642791b44c8063df25fd030e92f1bf38f5c238924be07e1038"

RPROVIDES:${PN} += "openvswitch-devel-/usr/include/ovn \
ovn-devel"

RDEPENDS:${PN} += "libovn-23-03-0"

inherit rpm
