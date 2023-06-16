SUMMARY = "Python module to create reports from Python objects"
DESCRIPTION = "This is a Python module to create reports from Python objects. \
Output plugins to several formats are included, such \
as documents (odt, ods, pdf) or images (png, svg)."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python311-relatorio-0.10.1-1.6.noarch.rpm"
RPM_HASH = "3b82ccf3129d94c3ede341a63307494f222500f4c77086b24d89c7880174d1999f1ea4a6dda2bbf6fad9214a321f21962d86a6d53c4181dab3be9e16e8f30506"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-relatorio \
python311-relatorio \
python3dist-relatorio"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Genshi \
python311-PyYAML \
python311-lxml \
python311-pycha \
python311-python-magic \
update-alternatives"

inherit rpm
