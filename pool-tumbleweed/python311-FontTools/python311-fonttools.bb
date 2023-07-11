SUMMARY = "Suite of Tools and Libraries for Manipulating Fonts"
DESCRIPTION = "FontTools is a suite of tools and libraries for manipulating fonts \
written in Python. \
 \
It currently reads and writes TrueType font files, reads PostScript \
Type 1 fonts, and more. It contains two command line programs to \
convert TrueType fonts to an XML based format (called TTX) and back."
LICENSE = "MIT & OFL-1.1"

PV = "4.39.4"

RPM_NAME = "python311-FontTools-4.39.4-1.3.noarch.rpm"
RPM_HASH = "393156f93f38254f488c10e57c1dffa12a9395f6846c55e73064dd29655af6752f0bafc50561be1a8aac293dd5607fcbaf5bd729f2a25e7c91619572d93fd347"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fonttools \
python3-FontTools \
python3-fonttools \
python3.11dist-fonttools \
python311-FontTools \
python311-fonttools \
python3dist-fonttools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-fs \
update-alternatives"

inherit rpm
