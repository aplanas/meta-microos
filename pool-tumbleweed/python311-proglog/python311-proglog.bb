SUMMARY = "Log and progress bar manager for Python"
DESCRIPTION = "Proglog is a progress logging system for Python. It allows developers \
to build libraries while giving the user control on the management of \
logs, callbacks and progress bars."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python311-proglog-0.1.10-1.3.noarch.rpm"
RPM_HASH = "a286499559bc4d6d93e000378d09fbc4650d425bc4f1d52186dca1195003b556b9b09bc2dccaf10d91d42ea862eed4e32b3825b3f8c3f1e7e83268460cb6097c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proglog \
python3.11dist-proglog \
python311-proglog \
python3dist-proglog"

RDEPENDS:${PN} += "python-abi \
python311-tqdm"

inherit rpm
