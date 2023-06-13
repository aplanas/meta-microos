SUMMARY = "Noto Armenian Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Armenian Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-armenian-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "6d55f4b2d0c6f741f510854d75e89556a75b7f912233ab1410b09337e112d2ad17af1060f4bf7f64b9274a59739996068d9107f92e7aa1881bbb0766ed0d7787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-armenian \
noto-serif-armenian-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
