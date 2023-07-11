SUMMARY = "Noto Ol Chiki Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OlChiki Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-olchiki-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "4a8c77b9e12bfa57ffddefe90fd9d81b325374dc2a5c733a521f9aee29293fb77fa39dd1acfc8cebfa48fbaa1d32d532185bc8edc3173149cc1dc804a4da765a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-olchiki \
noto-sans-olchiki-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
