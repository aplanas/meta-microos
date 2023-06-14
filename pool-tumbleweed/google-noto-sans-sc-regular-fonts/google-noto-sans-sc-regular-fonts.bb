SUMMARY = "Noto Sans Simplified Chinese Font - Regular"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Regular weight \
of Sans font for Simplified Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-sc-regular-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "4c35e55a2a667eaabc40e9c622efbe2a364b04ad992f679ce869e2d3ae247599c24e7f8ae57e7e9dced6e041539f848892c559a791c73f8d2772cc1ad4fcc078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sc-regular-fonts \
noto-sans-sc-regular-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
