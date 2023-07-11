SUMMARY = "Suite of Tools and Libraries for Manipulating Fonts"
DESCRIPTION = "FontTools is a suite of tools and libraries for manipulating fonts \
written in Python. \
 \
It currently reads and writes TrueType font files, reads PostScript \
Type 1 fonts, and more. It contains two command line programs to \
convert TrueType fonts to an XML based format (called TTX) and back."
LICENSE = "MIT & OFL-1.1"

PV = "4.39.4"

RPM_NAME = "python310-FontTools-4.39.4-1.3.noarch.rpm"
RPM_HASH = "9bc1d0e6b06928d76aeb5d1cfca65ec98deab5fadd2b58b2108e0b9f88309c1627db26858ca4b3793643864967c90c8def3b5a510c74a62839232d9fcada0b10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-fonttools \
python310-FontTools \
python310-fonttools \
python3dist-fonttools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-fs \
update-alternatives"

inherit rpm
