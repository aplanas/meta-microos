SUMMARY = "Tool to load, configure, and compose WSGI applications and servers"
DESCRIPTION = "This tool provides code to load WSGI applications and servers from URIs; these \
URIs can refer to Python Eggs for INI-style configuration files. Paste Script \
provides commands to serve applications based on this configuration file."
LICENSE = "MIT"

PV = "2.1.1+git.1652668078.0f0697d"

RPM_NAME = "python39-PasteDeploy-2.1.1+git.1652668078.0f0697d-2.3.noarch.rpm"
RPM_HASH = "8324a535df8d3dcec03dd03045a460e7da190726cdff5627f4fdf9358da222ae4ad2c35d9333c3ced11a4a920f66288b435ea16275f573fe68250fef3be8eb8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pastedeploy \
python39-PasteDeploy \
python39-pastedeploy \
python3dist-pastedeploy"

RDEPENDS:${PN} += "python-abi \
python39-Paste \
python39-setuptools"

inherit rpm
