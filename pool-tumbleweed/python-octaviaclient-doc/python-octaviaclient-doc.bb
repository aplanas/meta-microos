SUMMARY = "Documentation for OpenStack Octavia API Client"
DESCRIPTION = "The Python Octavia Client (python-octaviaclient) is a command-line client for \
the OpenStack Load Balancing service. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python-octaviaclient-doc-2.5.0-1.6.noarch.rpm"
RPM_HASH = "0a18ea2fc57eece844d87cdd4bbdabc0967310e4804e56caaeeff7547b29b505db2fbb981a822a78fc3d2537572be4d92ff1a6486ea00e410b67b33d9b6e9a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-octaviaclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
