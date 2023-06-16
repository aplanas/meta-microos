SUMMARY = "Noto Sans Korean Font - Regular"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Regular weight \
of Sans font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-kr-regular-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "6315148888dad595dc1da3cd495d768b1f7279bc5d5309a28d1572beda1e36e9fb5cb597ac617f1cef789fb3bc57f4a535bd82ee3034b6aaebeda2fb33f8260e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kr-regular-fonts \
noto-sans-kr-regular-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
