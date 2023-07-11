SUMMARY = "A Python library to help draw Feynman diagrams"
DESCRIPTION = "PyFeyn is a package to programmaticaly draw Feynman diagrams. These \
are important constructs in perturbative field theory, so being able \
to draw them in a programmatic fashion is important if attempting to \
enumerate a large number of diagram configurations is important. \
PyFeyn can output into PDF or EPS. Special effects can be obtained by \
using constructs from PyX, which PyFeyn is based around."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "python311-pyfeyn-1.0.0-4.19.noarch.rpm"
RPM_HASH = "c309f32d04571b915e08f81ec0401bcead048ab0456c7b1dbd3695e1b8d0f0cae78433236ce024aae9e3d8e2ea34b7884b9c63783c0f1a54a3d6742384f46188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyfeyn \
python3.11dist-pyfeyn \
python311-pyfeyn \
python3dist-pyfeyn"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-PyX \
update-alternatives"

inherit rpm
