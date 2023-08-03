SUMMARY = "Documentation for OpenStack Heat API Client"
DESCRIPTION = "This is a client for the OpenStack Heat API. There's a Python API (the \
heatclient module), and a command-line script (heat). Each implements 100% of \
the OpenStack Heat API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python-heatclient-doc-3.2.0-1.3.noarch.rpm"
RPM_HASH = "f2f31bce89b07e602c63987d57adff5365a95897fc58b9e4477b01c8182d18d9b7f3db1ec4635e8f12e2cf55811e486c93d18890d15cd8b36986896bcb8b90fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-heatclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
