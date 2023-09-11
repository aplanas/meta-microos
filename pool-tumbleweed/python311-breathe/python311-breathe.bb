SUMMARY = "Sphinx Doxygen renderer"
DESCRIPTION = "Breathe is an extension to reStructuredText and Sphinx to be \
able to read and  render Doxygen xml output."
LICENSE = "BSD-3-Clause"

PV = "4.35.0"

RPM_NAME = "python311-breathe-4.35.0-1.1.noarch.rpm"
RPM_HASH = "4edb1955332f2c05f60fc3373b90595dd3be2a3f847cc5916ff642c86c65e718dcf925b6a2993e94df1642b91e88c16b7613d83de02ee26b99efe871f039c0f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-breathe \
python3-sphinxcontrib-breathe \
python3.11dist-breathe \
python311-breathe \
python311-sphinxcontrib-breathe \
python3dist-breathe"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Sphinx \
python311-docutils \
update-alternatives"

inherit rpm
