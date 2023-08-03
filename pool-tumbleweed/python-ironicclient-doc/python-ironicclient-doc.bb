SUMMARY = "Documentation for OpenStack Ironic API Client"
DESCRIPTION = "This is a client for the OpenStack Ironic API (Bare Metal. There's a \
Python API (the ironicclient module), and a command-line script (ironic). \
Each implements 100% of the OpenStack Ironic API. \
This package contains auto-generated documentation."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python-ironicclient-doc-5.1.0-1.4.noarch.rpm"
RPM_HASH = "75f0513160ac2c69f639e0d2ed6d2d0376005f22aa096c00d58db67053246b74970931d66889e30588e3e888b2767d77edff3f1c2bdff061bb139b217e5526d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-ironicclient-doc"

RDEPENDS:${PN} += ""

inherit rpm
