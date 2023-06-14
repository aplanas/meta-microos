SUMMARY = "A Python library to help draw Feynman diagrams"
DESCRIPTION = "PyFeyn is a package to programmaticaly draw Feynman diagrams. These \
are important constructs in perturbative field theory, so being able \
to draw them in a programmatic fashion is important if attempting to \
enumerate a large number of diagram configurations is important. \
PyFeyn can output into PDF or EPS. Special effects can be obtained by \
using constructs from PyX, which PyFeyn is based around."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "python39-pyfeyn-1.0.0-4.18.noarch.rpm"
RPM_HASH = "c8945fa27f1b92d76f410ea463f0733c8c64512ad8382a892197ee6e363e8e62cd3472de3b06dcf270da3e01f0275691f10e17700218b14e3a84ee12e641b565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyfeyn \
python39-pyfeyn \
python3dist-pyfeyn"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-PyX \
update-alternatives"

inherit rpm
