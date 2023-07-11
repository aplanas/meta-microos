SUMMARY = "Tool to load, configure, and compose WSGI applications and servers"
DESCRIPTION = "This tool provides code to load WSGI applications and servers from URIs; these \
URIs can refer to Python Eggs for INI-style configuration files. Paste Script \
provides commands to serve applications based on this configuration file."
LICENSE = "MIT"

PV = "2.1.1+git.1652668078.0f0697d"

RPM_NAME = "python311-PasteDeploy-2.1.1+git.1652668078.0f0697d-2.3.noarch.rpm"
RPM_HASH = "50f064953a85c396e3712a14e56c62eb9157920c5348b9ea7b4898e31ea821721dd291843908714c5eb6e69021422afcd1f2a8d512fa8d8de663bd74be552167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PasteDeploy \
python3-pastedeploy \
python3.11dist-pastedeploy \
python311-PasteDeploy \
python311-pastedeploy \
python3dist-pastedeploy"

RDEPENDS:${PN} += "python-abi \
python311-Paste \
python311-setuptools"

inherit rpm
