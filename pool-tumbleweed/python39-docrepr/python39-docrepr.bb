SUMMARY = "Python module to render docstrings as HTML"
DESCRIPTION = "The docrepr package renders Python docstrings as HTML. It is based on \
the sphinxify module developed by Tim Dumol for the Sage Notebook and \
the utils.inspector module developed for the Spyder IDE."
LICENSE = "BSD-3-Clause"

PV = "0.1.1"

RPM_NAME = "python39-docrepr-0.1.1-2.18.noarch.rpm"
RPM_HASH = "209cbb4330e336481637b68833c54ce86bc3ef7e35300c37f8461b752ba2f30017ebe3953cfd6e190c33d6ecda9c6ea5c3b7f3cec99fa6cb4a1f241838588b5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-docrepr \
python39-docrepr \
python3dist-docrepr"

RDEPENDS:${PN} += "python-abi \
python39-Jinja2 \
python39-Sphinx \
python39-docutils"

inherit rpm
