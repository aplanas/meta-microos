SUMMARY = "Documentation for OpenStack sushy"
DESCRIPTION = "Sushy is a Python library to communicate with `Redfish` based systems. \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python-sushy-doc-4.5.0-1.1.noarch.rpm"
RPM_HASH = "eae731832ad226aeeb4314cfea0a31fa764b5cb6bef8212c83cf37ffeca2d6b4e598f38231b4c27e4d87eceea7f69d5e0d10fe6b1f9de3b4bc7cb988bb0332a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-sushy-doc"

RDEPENDS:${PN} += ""

inherit rpm
