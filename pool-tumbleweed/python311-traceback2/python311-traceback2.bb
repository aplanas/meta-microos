SUMMARY = "Backports of the traceback module"
DESCRIPTION = "A backport of traceback to older supported Pythons."
LICENSE = "Python-2.0"

PV = "1.4.0"

RPM_NAME = "python311-traceback2-1.4.0-7.1.noarch.rpm"
RPM_HASH = "7a918a7880cae0176d118999eecc5d8ae96cf71bbdc258a215578bf8a407afa04e705c905388b15c6523f04daeb9d90a90ec87c021232f63d2beb961db985a38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(traceback2) \
python311-traceback2 \
python3dist(traceback2)"
RDEPENDS:${PN} += "python(abi) \
python311-linecache2 \
python311-pbr"

inherit rpm
