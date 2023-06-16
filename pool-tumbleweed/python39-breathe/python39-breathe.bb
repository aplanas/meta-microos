SUMMARY = "Sphinx Doxygen renderer"
DESCRIPTION = "Breathe is an extension to reStructuredText and Sphinx to be \
able to read and  render Doxygen xml output."
LICENSE = "BSD-3-Clause"

PV = "4.34.0"

RPM_NAME = "python39-breathe-4.34.0-5.2.noarch.rpm"
RPM_HASH = "7542d662fd51894476e5db78129bcf1d79008904e45d80ab2c1d08eceb790fd6f4cc075874024556f7cfed6c39f05eca8682d3987c404718e8b5f5e2d1f26eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-breathe \
python39-breathe \
python39-sphinxcontrib-breathe \
python3dist-breathe"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Sphinx \
python39-docutils \
update-alternatives"

inherit rpm
