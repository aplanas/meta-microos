SUMMARY = "Documentation for OpenStack Ironic API Client"
DESCRIPTION = "This is a client for the OpenStack Ironic API (Bare Metal. There's a \
Python API (the ironicclient module), and a command-line script (ironic). \
Each implements 100% of the OpenStack Ironic API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python-ironicclient-doc-5.1.0-1.3.noarch.rpm"
RPM_HASH = "6419018d019aa3997f6a51a589ad889cfc7756f2bff5811ed556d050f7025067a39c2c09c3f14c2bafacd3782e8d3394b008590fa2042a6da9d9d2939d40023f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ironicclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
