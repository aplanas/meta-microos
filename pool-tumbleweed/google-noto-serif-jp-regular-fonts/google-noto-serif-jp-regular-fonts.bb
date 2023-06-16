SUMMARY = "Noto Serif Japanese Font - Regular"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Regular weight of Serif font for Japanese, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-jp-regular-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "51f73d1650f42af9289671f1179287df00578a2c9baed7d5da8d0cddd8fcca8be4b1fa9382b9890fd57ef6e2632ce8890f2f1bdf83629848e8aef577e596b0fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-jp-regular-fonts \
noto-serif-jp-regular-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
