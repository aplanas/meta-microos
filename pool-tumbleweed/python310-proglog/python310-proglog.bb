SUMMARY = "Log and progress bar manager for Python"
DESCRIPTION = "Proglog is a progress logging system for Python. It allows developers \
to build libraries while giving the user control on the management of \
logs, callbacks and progress bars."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python310-proglog-0.1.10-1.1.noarch.rpm"
RPM_HASH = "3f7ae36d2cbb25a65b753c235ccbba6fe53d20acca6373e76dbe26abc89dcce6f92327d874058e0a1687203185f43034b81123fde6f08f43a52ac2076ecac920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-proglog \
python3.10dist-proglog \
python310-proglog \
python3dist-proglog"

RDEPENDS:${PN} += "python-abi \
python310-tqdm"

inherit rpm
