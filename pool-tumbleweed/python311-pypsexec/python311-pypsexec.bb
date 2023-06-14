SUMMARY = "Run commands on a remote Windows host using SMB/RPC"
DESCRIPTION = "This library can run commands on a remote Windows host through Python. \
This means that it can be run on any host with Python and does not \
require any binaries to be present or a specific OS. It uses SMB/RPC to \
executable commands in a similar fashion to the popular PsExec tool."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python311-pypsexec-0.3.0-2.5.noarch.rpm"
RPM_HASH = "7e88ddb3371ff4c1bed7c1c2027e28bed683101f7272746752a24a33cca1e33a9eb9c1b7593191936cba9b9d914e6965b608e71b1e4119ef82323e1eada47bb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pypsexec \
python311-pypsexec \
python3dist-pypsexec"

RDEPENDS:${PN} += "python-abi \
python311-smbprotocol"

inherit rpm
