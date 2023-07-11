SUMMARY = "Noto Tifinagh APT Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghAPT Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghapt-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "24f0c7223b02d5cb3f890e5114a4bb6eb45425a8556b48ca7ed848600808356a1b13ff479d6a463798a1657f9690c02d3ae792657f905221936ccd19964c9a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghapt \
noto-sans-tifinaghapt-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
