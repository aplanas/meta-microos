SUMMARY = "Run commands on a remote Windows host using SMB/RPC"
DESCRIPTION = "This library can run commands on a remote Windows host through Python. \
This means that it can be run on any host with Python and does not \
require any binaries to be present or a specific OS. It uses SMB/RPC to \
executable commands in a similar fashion to the popular PsExec tool."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-pypsexec-0.3.0-2.7.noarch.rpm"
RPM_HASH = "25dbcac405af6b96ebe569f600781973b92e271ca42182d72f42008b9d4df57dbb6838666ff09cf620ea502066f3bc4e7487da70f160016884b010d3e1fbd1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pypsexec \
python310-pypsexec \
python3dist-pypsexec"

RDEPENDS:${PN} += "python-abi \
python310-smbprotocol"

inherit rpm
