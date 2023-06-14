SUMMARY = "Backports of the traceback module"
DESCRIPTION = "A backport of traceback to older supported Pythons."
LICENSE = "Python-2.0"

PV = "1.4.0"

RPM_NAME = "python310-traceback2-1.4.0-7.1.noarch.rpm"
RPM_HASH = "108525bac10be9e840b3737fe78e7b83747c3cb2da641db14de4d4e1f7b71e0623d6caeae5d1a025c4a6320c59155bf5714dc890be1e4adbed3159326c5dc01e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-traceback2 \
python3.10dist-traceback2 \
python310-traceback2 \
python3dist-traceback2"

RDEPENDS:${PN} += "python-abi \
python310-linecache2 \
python310-pbr"

inherit rpm
