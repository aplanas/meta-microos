SUMMARY = "Log and progress bar manager for Python"
DESCRIPTION = "Proglog is a progress logging system for Python. It allows developers \
to build libraries while giving the user control on the management of \
logs, callbacks and progress bars."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python39-proglog-0.1.10-1.3.noarch.rpm"
RPM_HASH = "382eb5a2305016fdca27c8d575f6310b131d61f73c965902e73ae9ce311ad1186dd1784a6478a49f146086ccc1558e6be7fea613a99f6e15694d952fcba0380c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-proglog \
python39-proglog \
python3dist-proglog"

RDEPENDS:${PN} += "python-abi \
python39-tqdm"

inherit rpm
