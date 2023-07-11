SUMMARY = "Noto Arabic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Arabic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-arabic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "17498f2fcb620292aa772ab5164a5e1302995606e22072588dd22300051888f8b146caf224815ec5839c46b6d70c079c9f05ff47e3b66772d1916356d313cc6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-arabic \
noto-sans-arabic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
