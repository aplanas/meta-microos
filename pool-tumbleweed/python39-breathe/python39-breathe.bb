SUMMARY = "Sphinx Doxygen renderer"
DESCRIPTION = "Breathe is an extension to reStructuredText and Sphinx to be \
able to read and  render Doxygen xml output."
LICENSE = "BSD-3-Clause"

PV = "4.34.0"

RPM_NAME = "python39-breathe-4.34.0-6.1.noarch.rpm"
RPM_HASH = "1d29808d2acacca55ab6745a2a95a8d0b237eebe11815c3b7ff96daf03523598fa76ade53da478958a4aa796d666ad4226dbcc4e772024ef7799aa3a833115e9"
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
