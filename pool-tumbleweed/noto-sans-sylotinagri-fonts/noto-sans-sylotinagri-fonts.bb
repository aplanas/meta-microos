SUMMARY = "Noto Syloti Nagri Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SylotiNagri Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-sylotinagri-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "32a54e691700dc3baa226a3ef03d0140b360c7bcfdade0dde0c66e4af7bb85a9a7c30fb8451598ed318a0b191f42ac266e55431c5b5e9cad797cff036ba5ce13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-sylotinagri \
noto-sans-sylotinagri-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
