SUMMARY = "SqlAlchemy schema display script"
DESCRIPTION = "SqlAlchemy schema display script"
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "python39-sadisplay-0.4.9-2.18.noarch.rpm"
RPM_HASH = "80db62ae5f712a7765676b869f539291fad7e13a448b38dae176486d820a934d427cca27bf5996f2330abb1320cd9aa3824f141ec7cef1d70696b93d7e1f41cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-sadisplay \
python39-sadisplay \
python3dist-sadisplay"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-SQLAlchemy \
update-alternatives"

inherit rpm
