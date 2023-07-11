SUMMARY = "Noto Cherokee Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Cherokee Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-cherokee-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "21cbcf57d28d4ca077d7066c20a3033d18bc1bb835a5ff5d6044608d9683ce2acbc4f5adf3b410a6e4b0e2b35a4b719d224683b304828c7fd620a34e691a0412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-cherokee \
noto-sans-cherokee-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
