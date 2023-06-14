SUMMARY = "Suite of Tools and Libraries for Manipulating Fonts"
DESCRIPTION = "FontTools is a suite of tools and libraries for manipulating fonts \
written in Python. \
 \
It currently reads and writes TrueType font files, reads PostScript \
Type 1 fonts, and more. It contains two command line programs to \
convert TrueType fonts to an XML based format (called TTX) and back."
LICENSE = "MIT & OFL-1.1"

PV = "4.39.3"

RPM_NAME = "python310-FontTools-4.39.3-2.1.noarch.rpm"
RPM_HASH = "c5fd8e37059625b4d94dfd86428db419f5d5fd31601385902b6eb93410b99f56ad4bb098c1b36702d47c52c7fb1cf386dd957e8a728c46664c602d34e36c9fca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fonttools \
python3-FontTools \
python3-fonttools \
python3.10dist-fonttools \
python310-FontTools \
python310-fonttools \
python3dist-fonttools"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-fs \
update-alternatives"

inherit rpm
