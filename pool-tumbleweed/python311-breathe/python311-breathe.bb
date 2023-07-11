SUMMARY = "Sphinx Doxygen renderer"
DESCRIPTION = "Breathe is an extension to reStructuredText and Sphinx to be \
able to read and  render Doxygen xml output."
LICENSE = "BSD-3-Clause"

PV = "4.34.0"

RPM_NAME = "python311-breathe-4.34.0-6.1.noarch.rpm"
RPM_HASH = "7b6cdba8f490bb42ca6280575d0f2df3ce844366fbfd842a1bd660fa7a4eaf61a6c254da776594a373fe9553b9a9326dbc7d7516368eaf00a21a1a8ea1f06523"
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
