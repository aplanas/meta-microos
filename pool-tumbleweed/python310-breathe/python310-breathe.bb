SUMMARY = "Sphinx Doxygen renderer"
DESCRIPTION = "Breathe is an extension to reStructuredText and Sphinx to be \
able to read and  render Doxygen xml output."
LICENSE = "BSD-3-Clause"

PV = "4.35.0"

RPM_NAME = "python310-breathe-4.35.0-1.1.noarch.rpm"
RPM_HASH = "913fcea3e287c03c625ed732b4d4943141c7ae5d714e380d21993e195c8ab85db778d785d95e7eeec0ba810860ca8452d6dc7e2fa3cdb4cad81e14e3cb1197ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-breathe \
python310-breathe \
python310-sphinxcontrib-breathe \
python3dist-breathe"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Sphinx \
python310-docutils \
update-alternatives"

inherit rpm
