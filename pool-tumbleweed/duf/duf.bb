SUMMARY = "Disk Usage/Free Utility"
DESCRIPTION = "Disk Usage/Free Utility (Linux, BSD, macOS & Windows)"
LICENSE = "MIT"

PV = "0.8.1+git64.24c3369"

RPM_NAME = "duf-0.8.1+git64.24c3369-1.2.aarch64.rpm"
RPM_HASH = "56812e37829639de329310f001d3196c142998bff39d18618cf54013c4cbefb6b69c3d119d3b123c7395ddaec560057279eb0d4e5ba83588b2ac0803addd3ce7"

RPROVIDES:${PN} += "duf"

RDEPENDS:${PN} += ""

inherit rpm
