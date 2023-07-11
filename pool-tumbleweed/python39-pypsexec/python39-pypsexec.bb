SUMMARY = "Run commands on a remote Windows host using SMB/RPC"
DESCRIPTION = "This library can run commands on a remote Windows host through Python. \
This means that it can be run on any host with Python and does not \
require any binaries to be present or a specific OS. It uses SMB/RPC to \
executable commands in a similar fashion to the popular PsExec tool."
LICENSE = "MIT"

PV = "0.3.0"

RPM_NAME = "python39-pypsexec-0.3.0-2.7.noarch.rpm"
RPM_HASH = "f5a761c00c06562dc9e117236889e294fef468e98aace4ebe95e89088e7f8ce4c86782cc1f0b91807e587ac3ba289f563eda36ef8937d1bd2b3e6fb5c2742e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pypsexec \
python39-pypsexec \
python3dist-pypsexec"

RDEPENDS:${PN} += "python-abi \
python39-smbprotocol"

inherit rpm
