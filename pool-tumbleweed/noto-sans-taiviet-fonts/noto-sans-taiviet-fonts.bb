SUMMARY = "Noto Tai Viet Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TaiViet Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-taiviet-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "09770ac3a40b036947475ce3fac4b96308740664bc90ccc504a0cbd8233f25662e719d431db23ea6406460ec19fc00d1b5b0bb6d62cf9d507ae4c8901d172c0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-taiviet \
noto-sans-taiviet-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
