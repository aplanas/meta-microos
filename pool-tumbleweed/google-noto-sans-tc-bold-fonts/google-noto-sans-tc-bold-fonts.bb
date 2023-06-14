SUMMARY = "Noto Sans Traditional Chinese Font - Bold"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Bold weight of \
Sans font for Traditional Chinese, hinted."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-tc-bold-fonts-2.004-3.3.noarch.rpm"
RPM_HASH = "dd176d2cb4165145e18169c7a5870900ec1a310bca17486bf03d4b93dcdff7f7a33cb2532eeaea8f1669286aa8db9805a0895858ebc8abd2b2a1821f79d7926c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-tc-bold-fonts \
noto-sans-tc-bold-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
