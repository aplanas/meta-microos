SUMMARY = "Backports of the traceback module"
DESCRIPTION = "A backport of traceback to older supported Pythons."
LICENSE = "Python-2.0"

PV = "1.4.0"

RPM_NAME = "python311-traceback2-1.4.0-7.3.noarch.rpm"
RPM_HASH = "b5eb59ad5b90e27d191560bff32e360c5dda3a21df370ad14e073b3030246ee59b8d30b2ee8301516b2002b9d5b6ae7ab146a7dc1525f88458d37f5546c8a7e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-traceback2 \
python3.11dist-traceback2 \
python311-traceback2 \
python3dist-traceback2"

RDEPENDS:${PN} += "python-abi \
python311-linecache2 \
python311-pbr"

inherit rpm
