SUMMARY = "Python mutation testing"
DESCRIPTION = "Python mutation testing."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python311-mutmut-2.0.0-4.9.noarch.rpm"
RPM_HASH = "c4de674f0a71274c46125568ede75f620a84efb3d2ce898aa5a424c4618bb059fcf812df5df749f59372a3da28b8691cb2b201cccfa930d7ce1d857fff95ab11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mutmut \
python3.11dist-mutmut \
python311-mutmut \
python3dist-mutmut"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-click \
python311-glob2 \
python311-hammett \
python311-junit-xml \
python311-parso \
python311-pony \
python311-setuptools \
python311-tri.declarative \
update-alternatives"

inherit rpm
