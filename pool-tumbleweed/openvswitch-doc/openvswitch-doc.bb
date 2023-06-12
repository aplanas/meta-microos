SUMMARY = "Open vSwitch Documentation"
DESCRIPTION = "Contains additional documentation for the Open vSwitch."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "openvswitch-doc-3.1.0-14.1.noarch.rpm"
RPM_HASH = "f7f5c031295d03dd32f97149a3d87e6344c56938ffcbab46f9ba32fd3d41148b5a53f0f8cc3c0d675e2caec19fb92429b70f1d530abefda108f483d6b53baa55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openvswitch-doc"
RDEPENDS:${PN} += ""

inherit rpm
