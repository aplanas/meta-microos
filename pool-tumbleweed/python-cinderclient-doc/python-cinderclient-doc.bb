SUMMARY = "Documentation for OpenStack Cinder API Client"
DESCRIPTION = "This is a client for the OpenStack Cinder API (Block Storage. There's a \
Python API (the cinderclient module), and a command-line script (cinder). \
Each implements 100% of the OpenStack Cinder API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "9.3.0"

RPM_NAME = "python-cinderclient-doc-9.3.0-1.3.noarch.rpm"
RPM_HASH = "7a60995b022f9e3ea1522b7ca5df78b7079723a5c0e8a0eadd539b899418ecb06f6e21d407f4a7a8d4112409983fd458a78dd142ece7193b0950590e694418e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-cinderclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
