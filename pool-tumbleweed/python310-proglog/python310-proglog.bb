SUMMARY = "Log and progress bar manager for Python"
DESCRIPTION = "Proglog is a progress logging system for Python. It allows developers \
to build libraries while giving the user control on the management of \
logs, callbacks and progress bars."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python310-proglog-0.1.10-1.3.noarch.rpm"
RPM_HASH = "5063aeb72ba475e57f54abb90b2bdd456b84dc966a9950c9c5d9b8b454dacb19ffd4ccfe3520a62f91f4841b5772c987700e697658cb32f4692e8c3faa67901f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-proglog \
python310-proglog \
python3dist-proglog"

RDEPENDS:${PN} += "python-abi \
python310-tqdm"

inherit rpm
