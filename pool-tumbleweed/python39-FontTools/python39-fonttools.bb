SUMMARY = "Suite of Tools and Libraries for Manipulating Fonts"
DESCRIPTION = "FontTools is a suite of tools and libraries for manipulating fonts \
written in Python. \
 \
It currently reads and writes TrueType font files, reads PostScript \
Type 1 fonts, and more. It contains two command line programs to \
convert TrueType fonts to an XML based format (called TTX) and back."
LICENSE = "MIT & OFL-1.1"

PV = "4.39.4"

RPM_NAME = "python39-FontTools-4.39.4-1.3.noarch.rpm"
RPM_HASH = "a9a2ba3b6e073e02384ec487bb4e7121d3df5fc098f2f32230a7eb9e65c47e52b90f5eef016d7c1ef4e4e86778645cbc027a45fcbffc575c45bd42a38592b61e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-fonttools \
python39-FontTools \
python39-fonttools \
python3dist-fonttools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-fs \
update-alternatives"

inherit rpm
