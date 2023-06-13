SUMMARY = "Documentation for OpenStack Octavia API Client"
DESCRIPTION = "The Python Octavia Client (python-octaviaclient) is a command-line client for \
the OpenStack Load Balancing service. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python-octaviaclient-doc-2.5.0-1.5.noarch.rpm"
RPM_HASH = "66a2dd9578cc6c2a14c04e1e37f6970a411d2fc0b048b9d79eb785ff2b881de6c3adef6312a776dee50b8e80913047338411e2abd6da3a72c884a4d0b586b55a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-octaviaclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
