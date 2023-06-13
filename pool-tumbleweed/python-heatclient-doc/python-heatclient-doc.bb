SUMMARY = "Documentation for OpenStack Heat API Client"
DESCRIPTION = "This is a client for the OpenStack Heat API. There's a Python API (the \
heatclient module), and a command-line script (heat). Each implements 100% of \
the OpenStack Heat API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python-heatclient-doc-3.2.0-1.2.noarch.rpm"
RPM_HASH = "8f4a783732bcd0c2ef9c9a333abe13c19f4424e8c25613a9f8ef458a103ddc5e52dd319005164eeb7ceac04c86987a52170b3f5df1e9a1de11fdfb0712870e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-heatclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
