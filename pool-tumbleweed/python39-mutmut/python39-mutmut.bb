SUMMARY = "Python mutation testing"
DESCRIPTION = "Python mutation testing."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python39-mutmut-2.0.0-4.9.noarch.rpm"
RPM_HASH = "ee8686065c51280c223d2a37300bb24950a996d3e21c82971f002da94517fd65e4c56e9688302faa917e52f93284e40a23b3eb74acb3e177f3f5317c8199a24a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mutmut \
python39-mutmut \
python3dist-mutmut"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-click \
python39-glob2 \
python39-hammett \
python39-junit-xml \
python39-parso \
python39-pony \
python39-setuptools \
python39-tri.declarative \
update-alternatives"

inherit rpm
