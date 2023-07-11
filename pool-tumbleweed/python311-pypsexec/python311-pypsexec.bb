SUMMARY = "Run commands on a remote Windows host using SMB/RPC"
DESCRIPTION = "This library can run commands on a remote Windows host through Python. \
This means that it can be run on any host with Python and does not \
require any binaries to be present or a specific OS. It uses SMB/RPC to \
executable commands in a similar fashion to the popular PsExec tool."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-pypsexec-0.3.0-2.7.noarch.rpm"
RPM_HASH = "0dcc8f5f9997b7d0db31f534dd791b4c672588aed7b347daf8eb3fe93adede0413c0c2080edb3191a0ee319547c88442a1345fb42c30b2f8a4d79c76b0441a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypsexec \
python3.11dist-pypsexec \
python311-pypsexec \
python3dist-pypsexec"

RDEPENDS:${PN} += "python-abi \
python311-smbprotocol"

inherit rpm
