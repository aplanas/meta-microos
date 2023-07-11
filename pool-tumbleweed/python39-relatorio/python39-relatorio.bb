SUMMARY = "Python module to create reports from Python objects"
DESCRIPTION = "This is a Python module to create reports from Python objects. \
Output plugins to several formats are included, such \
as documents (odt, ods, pdf) or images (png, svg)."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python39-relatorio-0.10.1-1.8.noarch.rpm"
RPM_HASH = "89908b837a66c2ab438997feb80e8cf6aa4f098f6d808d619e34e1bcb5bd9f2d83c0d4475d9220e151c7e92e6a4c0fb31bd35b6f4eb1a171c99c8c639ce51a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-relatorio \
python39-relatorio \
python3dist-relatorio"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Genshi \
python39-PyYAML \
python39-lxml \
python39-pycha \
python39-python-magic \
update-alternatives"

inherit rpm
