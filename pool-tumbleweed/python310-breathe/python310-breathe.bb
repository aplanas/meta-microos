SUMMARY = "Sphinx Doxygen renderer"
DESCRIPTION = "Breathe is an extension to reStructuredText and Sphinx to be \
able to read and  render Doxygen xml output."
LICENSE = "BSD-3-Clause"

PV = "4.34.0"

RPM_NAME = "python310-breathe-4.34.0-5.2.noarch.rpm"
RPM_HASH = "797f81cad44289d141224a051ecb7e07b14c38f60330238d2928b4cc26ca6a436a1109bed8a0e595e3870a00ef9cd799a2d0d718aff184d28e4cee2c4e7762bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-breathe \
python3-sphinxcontrib-breathe \
python3.10dist(breathe) \
python310-breathe \
python310-sphinxcontrib-breathe \
python3dist(breathe)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Sphinx \
python310-docutils \
update-alternatives"

inherit rpm
