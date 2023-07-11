SUMMARY = "Noto Myanmar Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Myanmar Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-myanmar-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "a16fd9e47f24a4273910e1d2000e9e49fd5a0b7c4c7c8944c26eebc937fa1374bc16f42b5e8b9c709d2689f07abc50a0acb68316b05059d4ad44aec25d83dc59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-myanmar-ui \
noto-sans-myanmar-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
