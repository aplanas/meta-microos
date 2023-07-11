SUMMARY = "Noto Tifinagh Azawagh Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TifinaghAzawagh Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tifinaghazawagh-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "04c18080a8b59bf87554454eba9e5bb5a7aaef507cfb4435912933060040297e5fbba2b8a47a119a5442e2e431525cdc7aa5fa6f8d290dd06036a9d4ff83ffe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tifinaghazawagh \
noto-sans-tifinaghazawagh-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
