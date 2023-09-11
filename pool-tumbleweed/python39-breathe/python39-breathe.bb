SUMMARY = "Sphinx Doxygen renderer"
DESCRIPTION = "Breathe is an extension to reStructuredText and Sphinx to be \
able to read and  render Doxygen xml output."
LICENSE = "BSD-3-Clause"

PV = "4.35.0"

RPM_NAME = "python39-breathe-4.35.0-1.1.noarch.rpm"
RPM_HASH = "5c2be42d7d0f8f7c773f51a9496a8516422a4c189bd0b90840d147cc9c1b4d6133bc06c8c0d4340446d89c7b0d65b5fea3b09764c1ff7407109d16982f3012b8"
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
