SUMMARY = "Command pipelines for python"
DESCRIPTION = "A wrapper for subprocess which provides command pipeline functionality."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.post1"

RPM_NAME = "python311-sarge-0.1.7.post1-1.4.noarch.rpm"
RPM_HASH = "0876d285e111ee4273c401a10ba0aa9d0a840447a4ffe9a32b9be45008cb9809da384bcd67a86d2baa4f0df2f1e574d14c7dd455f3a4cdcc1b0ad7ec43ea97c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sarge \
python3.11dist-sarge \
python311-sarge \
python3dist-sarge"

RDEPENDS:${PN} += "python-abi"

inherit rpm
