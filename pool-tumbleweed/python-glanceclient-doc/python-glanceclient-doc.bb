SUMMARY = "Documentation for OpenStack Glance API Client"
DESCRIPTION = "This is a client for the OpenStack Glance API. There's a Python API (the \
glanceclient module), and a command-line script (glance). Each implements \
100% of the OpenStack Glance API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "python-glanceclient-doc-4.3.0-1.3.noarch.rpm"
RPM_HASH = "656bca87bdaba2140691a19c747201e7b9f4f9758b2f6223a9e0c0eab290b2cb74db56d4188e85eff669ddefce1dee598e81eb795625a1aa763d544364724691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-glanceclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
