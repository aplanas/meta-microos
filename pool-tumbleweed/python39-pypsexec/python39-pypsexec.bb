SUMMARY = "Run commands on a remote Windows host using SMB/RPC"
DESCRIPTION = "This library can run commands on a remote Windows host through Python. \
This means that it can be run on any host with Python and does not \
require any binaries to be present or a specific OS. It uses SMB/RPC to \
executable commands in a similar fashion to the popular PsExec tool."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-pypsexec-0.3.0-2.5.noarch.rpm"
RPM_HASH = "7aa0211445d679a9e61549c2e1f14750bb5c375d973e298705358d1a136c8fda86e9a1d4324104e52940d05b8d08cf2f8a60be1bce43c0c5bf3b64f8c7721881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pypsexec) \
python39-pypsexec \
python3dist(pypsexec)"

RDEPENDS:${PN} += "python(abi) \
python39-smbprotocol"

inherit rpm
