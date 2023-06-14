SUMMARY = "Python module to render docstrings as HTML"
DESCRIPTION = "The docrepr package renders Python docstrings as HTML. It is based on \
the sphinxify module developed by Tim Dumol for the Sage Notebook and \
the utils.inspector module developed for the Spyder IDE."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "python310-docrepr-0.1.1-2.16.noarch.rpm"
RPM_HASH = "e323b387d63dd53719106ed429c18cb6f3af2013609e112790f5ae9557d9a5c4c309464b0f9c0a87d102e551e2311fae656432ab8691428b70b994a4e221c90a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-docrepr \
python3.10dist-docrepr \
python310-docrepr \
python3dist-docrepr"

RDEPENDS:${PN} += "python-abi \
python310-Jinja2 \
python310-Sphinx \
python310-docutils"

inherit rpm
