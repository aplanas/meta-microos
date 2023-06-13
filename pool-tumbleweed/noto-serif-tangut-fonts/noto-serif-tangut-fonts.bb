SUMMARY = "Noto Tangut Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tangut Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-tangut-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "03120a96e53f8d7f4d26ba2b7755a74ec3d7a77ad6db195baca15cab17a433b99163c2815a024459b4081ef6a1b836f34bde81de4ea5c44c14058ae1154b7808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-tangut \
noto-serif-tangut-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
