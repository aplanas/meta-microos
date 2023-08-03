SUMMARY = "Documentation for python-bpython"
DESCRIPTION = "Documentation and help files for python-bpython."
LICENSE = "MIT"

PV = "0.24"

RPM_NAME = "python-bpython-doc-0.24-3.1.noarch.rpm"
RPM_HASH = "544344c828a6a2deef46bcb665d898fc609a20dd0277ea3e9919bbfcf5fe1b66c059185cc884bb2a45dc1ebbe713a17e4254fb77bfef3f40db8d5c15ce85dcde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-bpython-doc \
python310-bpython-doc \
python311-bpython-doc \
python39-bpython-doc"

RDEPENDS:${PN} += ""

inherit rpm
