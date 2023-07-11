SUMMARY = "Manual for ant-contrib"
DESCRIPTION = "Documentation for ant-contrib tasks."
LICENSE = "Apache-2.0"

PV = "1.0b3"

RPM_NAME = "ant-contrib-manual-1.0b3-10.4.noarch.rpm"
RPM_HASH = "4df803187e2412e9e2d314a9ba1bf2bab82badf87d06b65e5b118cac462bb085c79e4064b29af6b919bbda3bb751065466f772d65bb38672b655f95c56862de2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ant-contrib-manual"

RDEPENDS:${PN} += ""

inherit rpm
