SUMMARY = "Tool to load, configure, and compose WSGI applications and servers"
DESCRIPTION = "This tool provides code to load WSGI applications and servers from URIs; these \
URIs can refer to Python Eggs for INI-style configuration files. Paste Script \
provides commands to serve applications based on this configuration file."
LICENSE = "MIT"

PV = "2.1.1+git.1652668078.0f0697d"

RPM_NAME = "python311-PasteDeploy-2.1.1+git.1652668078.0f0697d-2.1.noarch.rpm"
RPM_HASH = "569bd0dbc6941c846da7ce5005a94fc0faea66dad98992c9ddef82d745db66ff16c84d287f6c0d65362ab4d3c059af5bcc086012a93a0cf0025591377ba03dde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pastedeploy \
python311-PasteDeploy \
python311-pastedeploy \
python3dist-pastedeploy"

RDEPENDS:${PN} += "python-abi \
python311-Paste \
python311-setuptools"

inherit rpm
