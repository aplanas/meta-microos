SUMMARY = "Tool to load, configure, and compose WSGI applications and servers"
DESCRIPTION = "This tool provides code to load WSGI applications and servers from URIs; these \
URIs can refer to Python Eggs for INI-style configuration files. Paste Script \
provides commands to serve applications based on this configuration file."
LICENSE = "MIT"

PV = "2.1.1+git.1652668078.0f0697d"

RPM_NAME = "python39-PasteDeploy-2.1.1+git.1652668078.0f0697d-2.1.noarch.rpm"
RPM_HASH = "2d1df87ba54d7d8fce26fcf435f37b51245a0b7122e52c539741478683452cf4622f67e74c2dbdf64303ed7beffc3f858e93c603ce81ec02fb3be4f7b95fb5d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pastedeploy) \
python39-PasteDeploy \
python39-pastedeploy \
python3dist(pastedeploy)"

RDEPENDS:${PN} += "python(abi) \
python39-Paste \
python39-setuptools"

inherit rpm
