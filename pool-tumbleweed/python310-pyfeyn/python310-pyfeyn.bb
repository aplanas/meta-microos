SUMMARY = "A Python library to help draw Feynman diagrams"
DESCRIPTION = "PyFeyn is a package to programmaticaly draw Feynman diagrams. These \
are important constructs in perturbative field theory, so being able \
to draw them in a programmatic fashion is important if attempting to \
enumerate a large number of diagram configurations is important. \
PyFeyn can output into PDF or EPS. Special effects can be obtained by \
using constructs from PyX, which PyFeyn is based around."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "python310-pyfeyn-1.0.0-4.18.noarch.rpm"
RPM_HASH = "0e7a6c35b9eb01930d11971444bcaf9986fc7fee2677c71398b31595c61a71001f327ebf3de61ad18c1739beb5ec4cbd316a3bb7f2d1ec3a745ae946df0d59ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyfeyn \
python3.10dist(pyfeyn) \
python310-pyfeyn \
python3dist(pyfeyn)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-PyX \
update-alternatives"

inherit rpm
