SUMMARY = "Python module to render docstrings as HTML"
DESCRIPTION = "The docrepr package renders Python docstrings as HTML. It is based on \
the sphinxify module developed by Tim Dumol for the Sage Notebook and \
the utils.inspector module developed for the Spyder IDE."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "python311-docrepr-0.1.1-2.18.noarch.rpm"
RPM_HASH = "606a48ca390dbf5d48493b2f1c4dae35dbfc4687b463613d3c3eb0d4e00fed69e2dca90624c98f8873adac463d359e8f1e4b9e16350002da32e330665ff1855e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docrepr \
python3.11dist-docrepr \
python311-docrepr \
python3dist-docrepr"

RDEPENDS:${PN} += "python-abi \
python311-Jinja2 \
python311-Sphinx \
python311-docutils"

inherit rpm
