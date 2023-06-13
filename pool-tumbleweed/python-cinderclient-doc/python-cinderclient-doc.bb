SUMMARY = "Documentation for OpenStack Cinder API Client"
DESCRIPTION = "This is a client for the OpenStack Cinder API (Block Storage. There's a \
Python API (the cinderclient module), and a command-line script (cinder). \
Each implements 100% of the OpenStack Cinder API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "9.3.0"

RPM_NAME = "python-cinderclient-doc-9.3.0-1.2.noarch.rpm"
RPM_HASH = "ecf5a000b5c2301d0299f65a010a40e298929ffc58954c9dcb19bccec44712b6fefe6e7d051600e758aa0810d1f761150ba3ce774d524061a3e8951a8241140d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-cinderclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
