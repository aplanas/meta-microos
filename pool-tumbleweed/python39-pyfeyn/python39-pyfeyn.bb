SUMMARY = "A Python library to help draw Feynman diagrams"
DESCRIPTION = "PyFeyn is a package to programmaticaly draw Feynman diagrams. These \
are important constructs in perturbative field theory, so being able \
to draw them in a programmatic fashion is important if attempting to \
enumerate a large number of diagram configurations is important. \
PyFeyn can output into PDF or EPS. Special effects can be obtained by \
using constructs from PyX, which PyFeyn is based around."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "python39-pyfeyn-1.0.0-4.19.noarch.rpm"
RPM_HASH = "ff89c8cb3f2d77b6103ab94134ede2245935d5f7e837bc549f7a88d6f356e7cc8032a8e444cfbf6663edebb073a5d6882ce28fdd20aabbf19cab72f6524c7b65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyfeyn \
python39-pyfeyn \
python3dist-pyfeyn"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-PyX \
update-alternatives"

inherit rpm
