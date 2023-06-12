SUMMARY = "Run commands on a remote Windows host using SMB/RPC"
DESCRIPTION = "This library can run commands on a remote Windows host through Python. \
This means that it can be run on any host with Python and does not \
require any binaries to be present or a specific OS. It uses SMB/RPC to \
executable commands in a similar fashion to the popular PsExec tool."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python310-pypsexec-0.3.0-2.5.noarch.rpm"
RPM_HASH = "5de717dd9ea5bb0e6e17ca67ba839dfef12e2d2a67990876a690c425f493d9f2391c6422751ed14740ab89d1dad5c709dc63640e54089e1b94f1b6a0731d94ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pypsexec \
python3.10dist(pypsexec) \
python310-pypsexec \
python3dist(pypsexec)"
RDEPENDS:${PN} += "python(abi) \
python310-smbprotocol"

inherit rpm
