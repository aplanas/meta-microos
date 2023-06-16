SUMMARY = "Noto Sinhala Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Sinhala Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sinhala-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "eaf26afa4d8bbadd239855e78aeb94805b115d1215c6717f8b0c98016b0f60e4ba30334b273549c7b1a46010d574294a2a590f0c0ee834e084deb9b7fe78732b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sinhala \
noto-sans-sinhala-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
