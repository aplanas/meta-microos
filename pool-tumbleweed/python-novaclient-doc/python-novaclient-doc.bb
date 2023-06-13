SUMMARY = "Documentation for OpenStack Nova API Client"
DESCRIPTION = "This is a client for the OpenStack Nova API. There's a Python API (the \
novaclient module), and a command-line script (nova). Each implements 100% of \
the OpenStack Nova API. \
 \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "18.3.0"

RPM_NAME = "python-novaclient-doc-18.3.0-1.3.noarch.rpm"
RPM_HASH = "89900955f4f8bcc43a4774da2a64b7927c36bda87d75d3fd768d1b9b92b77d972d5e414ea78ebc76a43f6e6a70a669cf684396b7dac24babfb35cf8180305631"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-novaclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
