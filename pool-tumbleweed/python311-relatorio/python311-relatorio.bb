SUMMARY = "Python module to create reports from Python objects"
DESCRIPTION = "This is a Python module to create reports from Python objects. \
Output plugins to several formats are included, such \
as documents (odt, ods, pdf) or images (png, svg)."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python311-relatorio-0.10.1-1.8.noarch.rpm"
RPM_HASH = "5bd1e6ae58862c112f4909ea42f45ba99d6b28e1da71e38036322fb4a659641225163a190b0055864a893d5e739bfde8775ee6823f0d9b2678bdcb92671cc2f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-relatorio \
python3.11dist-relatorio \
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
