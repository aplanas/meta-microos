SUMMARY = "Filesystem events monitoring"
DESCRIPTION = "Python API and shell utilities to monitor file system events."
LICENSE = "Apache-2.0"

PV = "3.0.0"

RPM_NAME = "python311-watchdog-3.0.0-1.2.noarch.rpm"
RPM_HASH = "ee52d2ab1f8629ed7ae4e54e01002dc1dd15d815ae88dd352b742711194aaae54b38e6b58e76728476ec77c2d8dbc44d329063078be614262f2a583a207f0ecb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(watchdog) \
python311-watchdog \
python3dist(watchdog)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-PyYAML \
python311-pathtools \
update-alternatives"

inherit rpm
