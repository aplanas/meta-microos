SUMMARY = "Python module to render docstrings as HTML"
DESCRIPTION = "The docrepr package renders Python docstrings as HTML. It is based on \
the sphinxify module developed by Tim Dumol for the Sage Notebook and \
the utils.inspector module developed for the Spyder IDE."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "python310-docrepr-0.1.1-2.18.noarch.rpm"
RPM_HASH = "6228afb0d6c8a33c4a2081c42e181abd580a18c4860da7b336b65b05a49eb2ab12f768d22c5711c23374dcf784a56de4cf9f5d24e76d8009afd81cfe353b7cb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-docrepr \
python310-docrepr \
python3dist-docrepr"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-Sphinx \
python310-docutils"

inherit rpm
