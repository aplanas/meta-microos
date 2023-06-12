SUMMARY = "Documentation for OpenStack sushy"
DESCRIPTION = "Sushy is a Python library to communicate with `Redfish` based systems. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "4.4.2"

RPM_NAME = "python-sushy-doc-4.4.2-1.2.noarch.rpm"
RPM_HASH = "febfc8bfbdeb293b7f76d8121c49307357d749a4597a4cfa68c63d03ed47c160c1de3a6038d7563ba86e4523b45a46aba98adde1edb4e35a54b26a0434c9629e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sushy-doc"
RDEPENDS:${PN} += ""

inherit rpm
