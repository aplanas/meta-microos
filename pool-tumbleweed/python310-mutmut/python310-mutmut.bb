SUMMARY = "Python mutation testing"
DESCRIPTION = "Python mutation testing."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python310-mutmut-2.0.0-4.7.noarch.rpm"
RPM_HASH = "e46144649d8c7b0e1f30fd981ed9bcd146ad14f1d072b1cc483c56c2faf5b7b21e80807deb86da37b4cb16de48a806dc1bdd9ee0fadf37c697db207d96ffaf19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mutmut \
python3.10dist(mutmut) \
python310-mutmut \
python3dist(mutmut)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-click \
python310-glob2 \
python310-hammett \
python310-junit-xml \
python310-parso \
python310-pony \
python310-setuptools \
python310-tri.declarative \
update-alternatives"

inherit rpm
