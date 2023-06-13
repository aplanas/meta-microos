SUMMARY = "OpenStack Object Storage API Client Library - Documentation"
DESCRIPTION = "This is a python client for the Swift API. There's a Python API (the \
swiftclient module), and a command-line script (swift). \
 \
This package contains documentation files for python-swiftclient."
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "python-swiftclient-doc-4.1.0-1.3.noarch.rpm"
RPM_HASH = "553c489da51954497991ff3c8f1bb50ca015a531d6b3afd9950141635e3b69bfd96e8e55edd99c0e6f3153d99bd44b9b146fc8eeef8ea5b04c86e289e22211d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-swiftclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
