SUMMARY = "The X11 Protocol collection (documentation)"
DESCRIPTION = "Documentation for X11 protocol headers."
LICENSE = "MIT"

PV = "2022.2"

RPM_NAME = "xorgproto-doc-2022.2-2.1.noarch.rpm"
RPM_HASH = "8ba1fc656af5ec113d1d572b03b20ab5350de71355eada09d75abebb2134f7a3cc87b3119ee21f70bdf9a75a3940a28550379d76ff939841b096d8d7b451e18b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xorgproto-doc"
RDEPENDS:${PN} += ""

inherit rpm
