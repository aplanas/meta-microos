SUMMARY = "Log and progress bar manager for Python"
DESCRIPTION = "Proglog is a progress logging system for Python. It allows developers \
to build libraries while giving the user control on the management of \
logs, callbacks and progress bars."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python39-proglog-0.1.10-1.1.noarch.rpm"
RPM_HASH = "d3cf90f60011dfea13bb1de5cbe619d34bf579ab66bcf94577d3d73010486d8d8126a052d84b767e6b61368e96a9e5af1d0aa8a96449e75f79f1f63e981e43df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-proglog \
python39-proglog \
python3dist-proglog"

RDEPENDS:${PN} += "python-abi \
python39-tqdm"

inherit rpm
