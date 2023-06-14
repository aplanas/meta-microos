SUMMARY = "Python module to create reports from Python objects"
DESCRIPTION = "This is a Python module to create reports from Python objects. \
Output plugins to several formats are included, such \
as documents (odt, ods, pdf) or images (png, svg)."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.1"

RPM_NAME = "python39-relatorio-0.10.1-1.6.noarch.rpm"
RPM_HASH = "be26c274d7936a8424ea20b8b3bdc1e8a8dacdc20d5d6469703999652208ee7a8668562537225d3b81c2efe1dc20fdb887fe7da710d226ace96bd61d530fe57b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-relatorio \
python39-relatorio \
python3dist-relatorio"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python-abi \
python39-Genshi \
python39-PyYAML \
python39-lxml \
python39-pycha \
python39-python-magic \
update-alternatives"

inherit rpm
