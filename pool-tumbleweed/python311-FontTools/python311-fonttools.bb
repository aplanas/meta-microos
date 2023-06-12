SUMMARY = "Suite of Tools and Libraries for Manipulating Fonts"
DESCRIPTION = "FontTools is a suite of tools and libraries for manipulating fonts \
written in Python. \
 \
It currently reads and writes TrueType font files, reads PostScript \
Type 1 fonts, and more. It contains two command line programs to \
convert TrueType fonts to an XML based format (called TTX) and back."
LICENSE = "MIT & OFL-1.1"

PV = "4.39.3"

RPM_NAME = "python311-FontTools-4.39.3-2.1.noarch.rpm"
RPM_HASH = "aa0ae26c4afeefcc55d97be409abffc7e50fd4b03c47707d3229604a899a891dfcfd586b9bb301057961b3ca866c099a65c9d3f732c4cf383a24fb417a81b24c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(fonttools) \
python311-FontTools \
python311-fonttools \
python3dist(fonttools)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-fs \
update-alternatives"

inherit rpm
