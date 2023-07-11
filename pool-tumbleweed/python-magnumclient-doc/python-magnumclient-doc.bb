SUMMARY = "Documentation for OpenStack Magnum API client libary"
DESCRIPTION = "Client library for Magnum built on the Magnum API. It provides a Python API \
(the magnumclient module) and a command-line tool (magnum). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "python-magnumclient-doc-3.6.0-1.7.noarch.rpm"
RPM_HASH = "d93b0970e7e84abcb3a19c592cb5e730c74dc9585c26229b4063b5e4c358277a1c6ec619f6fc2150fbecb5f48289e5aa2290ad75b3b5bcdae650a5940b364154"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-magnumclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
