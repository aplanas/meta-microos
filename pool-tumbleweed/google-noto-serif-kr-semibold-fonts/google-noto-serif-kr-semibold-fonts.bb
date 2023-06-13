SUMMARY = "Noto Serif Korean Font - SemiBold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
SemiBold weight of Serif font for Korean, hinted."
LICENSE = "OFL-1.1"

PV = "2.001"

RPM_NAME = "google-noto-serif-kr-semibold-fonts-2.001-2.3.noarch.rpm"
RPM_HASH = "87aef8aafd599c2ae33fa1ee25e36374409da2e7531c9d9f25a12f35ed3e9c8baf95b955a0d49a8460196b58e5830972b7bde630984a4fecc4c1ead62183aa57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-kr-semibold-fonts \
noto-serif-kr-semibold-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
