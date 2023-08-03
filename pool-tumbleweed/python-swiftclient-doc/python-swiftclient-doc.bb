SUMMARY = "OpenStack Object Storage API Client Library - Documentation"
DESCRIPTION = "This is a python client for the Swift API. There's a Python API (the \
swiftclient module), and a command-line script (swift). \
 \
This package contains documentation files for python-swiftclient."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python-swiftclient-doc-4.1.0-1.4.noarch.rpm"
RPM_HASH = "0f65b7ff122498e3e3e56236c73405046377bd1be4d0adb23782d85414c38e27ac46dfbeed0ac35f1da1d0733e38ae38a9f97bf1f4fe1bfa93f471a328a177cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-swiftclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
