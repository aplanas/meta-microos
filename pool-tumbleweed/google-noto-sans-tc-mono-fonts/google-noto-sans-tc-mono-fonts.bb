SUMMARY = "Noto Sans Traditional Chinese Font - Monospace"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Monospace fonts \
for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-tc-mono-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "e12f8bd841fef74fb88172586c9e082259be867aab34cb40f7da3a60ce011887b839cc76c0d970eb0ee34a00ca2da1fcdac524981b991b2402b1006eb0b29d97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tc-mono-fonts \
noto-sans-tc-mono-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
