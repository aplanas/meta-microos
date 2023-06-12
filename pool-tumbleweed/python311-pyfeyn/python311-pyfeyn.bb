SUMMARY = "A Python library to help draw Feynman diagrams"
DESCRIPTION = "PyFeyn is a package to programmaticaly draw Feynman diagrams. These \
are important constructs in perturbative field theory, so being able \
to draw them in a programmatic fashion is important if attempting to \
enumerate a large number of diagram configurations is important. \
PyFeyn can output into PDF or EPS. Special effects can be obtained by \
using constructs from PyX, which PyFeyn is based around."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "python311-pyfeyn-1.0.0-4.18.noarch.rpm"
RPM_HASH = "119a8a6b7a390bac5610fdb19c011ad7a43422ad04517eece59f864d875893a42d43f4bc581af0853b70bec3876f07f8d2904a05e5ef45ea5367ee06ad583cd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyfeyn) \
python311-pyfeyn \
python3dist(pyfeyn)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-PyX \
update-alternatives"

inherit rpm
