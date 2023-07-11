SUMMARY = "Terminal JSON viewer"
DESCRIPTION = "Terminal JSON viewer."
LICENSE = "MIT"

PV = "24.1.0"

RPM_NAME = "fx-24.1.0-1.3.aarch64.rpm"
RPM_HASH = "959ef32c110ab11939b87b6c0fd5b14505a38df3d4cce532253da29931682fc598a3ea6505c6f4aed737bfe592b61e1e3d1649c7db602a5968393ffa0d7478d1"

RPROVIDES:${PN} += "fx"

RDEPENDS:${PN} += ""

inherit rpm
