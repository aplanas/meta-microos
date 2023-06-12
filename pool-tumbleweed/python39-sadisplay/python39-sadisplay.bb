SUMMARY = "SqlAlchemy schema display script"
DESCRIPTION = "SqlAlchemy schema display script"
LICENSE = "BSD-3-Clause"

PV = "0.4.9"

RPM_NAME = "python39-sadisplay-0.4.9-2.17.noarch.rpm"
RPM_HASH = "34ef3954870cca3f14c26e51ce50b852cb1ac0a932a4e64a42ca634e951d24005ad1f3a3d3fcd2899dafdc8e21482fa8d27b55834539fc565272da5aca4ff5a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sadisplay) \
python39-sadisplay \
python3dist(sadisplay)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-SQLAlchemy \
update-alternatives"

inherit rpm
