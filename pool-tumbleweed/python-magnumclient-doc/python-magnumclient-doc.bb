SUMMARY = "Documentation for OpenStack Magnum API client libary"
DESCRIPTION = "Client library for Magnum built on the Magnum API. It provides a Python API \
(the magnumclient module) and a command-line tool (magnum). \
This package contains the documentation."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "python-magnumclient-doc-3.6.0-1.8.noarch.rpm"
RPM_HASH = "0475f7386b9039adbf2e779357f58dfb35d87d31209996a047c239722e900ffbb5ce173b4c1332f9bada6aadbe41b910d21420ad2eeec7ed5bba2d56cba908a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-magnumclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
