SUMMARY = "Sphinx Doxygen renderer"
DESCRIPTION = "Breathe is an extension to reStructuredText and Sphinx to be \
able to read and  render Doxygen xml output."
LICENSE = "BSD-3-Clause"

PV = "4.34.0"

RPM_NAME = "python310-breathe-4.34.0-6.1.noarch.rpm"
RPM_HASH = "e94029288e3d2acdc020377a91f215b6b81458adb35aea6f0c48434f1b780af7977b4902d672f15ba006b44ab226a53e1a9f5dbc4edd173eaee0f45ad86340a1"
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
