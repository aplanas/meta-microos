SUMMARY = "Noto Sans Korean Font - Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Bold weight of \
Sans font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-kr-bold-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "f39433a44cab3aad8b7bcbace4124ec04a56e8907ff2dbefcd8fc4d81a7013a9993d0efe133b44e4d2aa6991c04e8308154424d9c1ce82e61ff6e33f74782a76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kr-bold-fonts \
noto-sans-kr-bold-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
