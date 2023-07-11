SUMMARY = "A Python library to help draw Feynman diagrams"
DESCRIPTION = "PyFeyn is a package to programmaticaly draw Feynman diagrams. These \
are important constructs in perturbative field theory, so being able \
to draw them in a programmatic fashion is important if attempting to \
enumerate a large number of diagram configurations is important. \
PyFeyn can output into PDF or EPS. Special effects can be obtained by \
using constructs from PyX, which PyFeyn is based around."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "python310-pyfeyn-1.0.0-4.19.noarch.rpm"
RPM_HASH = "ddeec294485eb945f29d11c8e454d56bc49214be411afd43c5eceef7618bfde10cfe01befcbe2dc88c3a7162be7a7838cd1b0ca1c31e08b85426dcb6488b2577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyfeyn \
python310-pyfeyn \
python3dist-pyfeyn"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-PyX \
update-alternatives"

inherit rpm
