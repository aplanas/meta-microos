SUMMARY = "SqlAlchemy schema display script"
DESCRIPTION = "SqlAlchemy schema display script"
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "python311-sadisplay-0.4.9-2.18.noarch.rpm"
RPM_HASH = "f621ee7586bc4ffa5c93a251784d2369a0de523ec568831b9d3b81877e9e66492644cb22b09e3f37ddbccc9f55ad70fa0eeb632049141872c305845c261750b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sadisplay \
python3.11dist-sadisplay \
python311-sadisplay \
python3dist-sadisplay"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-SQLAlchemy \
update-alternatives"

inherit rpm
