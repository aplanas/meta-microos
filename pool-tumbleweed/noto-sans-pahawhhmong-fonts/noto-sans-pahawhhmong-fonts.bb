SUMMARY = "Noto Pahawh Hmong Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
PahawhHmong Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-pahawhhmong-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "73daedc140cb2ac33c77c68ff8c615e10130a5c1aa29a1de0c7c2f15630d21e685f0428d57557fd2303d49fafed328f6e5ab28ac9e632ebea8d3ddb34664572b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-pahawhhmong \
noto-sans-pahawhhmong-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
