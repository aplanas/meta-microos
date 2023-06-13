SUMMARY = "Documentation for OpenStack Ironic API Client"
DESCRIPTION = "This is a client for the OpenStack Ironic API (Bare Metal. There's a \
Python API (the ironicclient module), and a command-line script (ironic). \
Each implements 100% of the OpenStack Ironic API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python-ironicclient-doc-5.1.0-1.2.noarch.rpm"
RPM_HASH = "1f3a7f7c211fa13188d53a62188c703ee2487fcf2549c0b3f2d16eefcbca7bb2ecdd03c3ac72c081e0b0f503956c0c673de75ecc50947fe62f57b606968682da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ironicclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
