SUMMARY = "Python mutation testing"
DESCRIPTION = "Python mutation testing."
LICENSE = "BSD-3-Clause"

PV = "2.0.0"

RPM_NAME = "python310-mutmut-2.0.0-4.9.noarch.rpm"
RPM_HASH = "b5d5cb8dab62d1d7c2541257b1b620e54bdf57b27a95aa809c9d6aef2bf52e1489ccd4acce4104af4b47d5e07be426a171e11f370b00ba251e1792bc40bd07df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mutmut \
python310-mutmut \
python3dist-mutmut"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
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
