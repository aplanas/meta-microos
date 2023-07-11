SUMMARY = "Tool to load, configure, and compose WSGI applications and servers"
DESCRIPTION = "This tool provides code to load WSGI applications and servers from URIs; these \
URIs can refer to Python Eggs for INI-style configuration files. Paste Script \
provides commands to serve applications based on this configuration file."
LICENSE = "MIT"

PV = "2.1.1+git.1652668078.0f0697d"

RPM_NAME = "python310-PasteDeploy-2.1.1+git.1652668078.0f0697d-2.3.noarch.rpm"
RPM_HASH = "ed7fa9ef4d8ebc78b8c7c5b25673074cf7a000dc535c039300725f356b8de3e5a47c29093c7cca5d83b89a66af4e563b906c9f7393976b2948cec50e9f9ed0cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pastedeploy \
python310-PasteDeploy \
python310-pastedeploy \
python3dist-pastedeploy"

RDEPENDS:${PN} += "python-abi \
python310-Paste \
python310-setuptools"

inherit rpm
