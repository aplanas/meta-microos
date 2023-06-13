SUMMARY = "Python module to render docstrings as HTML"
DESCRIPTION = "The docrepr package renders Python docstrings as HTML. It is based on \
the sphinxify module developed by Tim Dumol for the Sage Notebook and \
the utils.inspector module developed for the Spyder IDE."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "python39-docrepr-0.1.1-2.16.noarch.rpm"
RPM_HASH = "db548880656e31b81a07cc3988e7c69ec0ccab6b9159fa4794fdee443bf14bb74225ca8ff0a412497b8c3fd380ac426939f68612ce2e5ca1ebda2c8e51dcf11d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(docrepr) \
python39-docrepr \
python3dist(docrepr)"

RDEPENDS:${PN} += "python(abi) \
python39-Jinja2 \
python39-Sphinx \
python39-docutils"

inherit rpm
