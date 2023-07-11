SUMMARY = "Noto Mende Kikakui Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
MendeKikakui Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-mendekikakui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "5cb873bdb3e5f8f4cb1f0527cf8d5c30e4c230cdafd1d93422b6465c0ab662156da34c29ea906c5577ada7ce01f3579650c45f4e4c1c6a66d7478ee4576aabf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-mendekikakui \
noto-sans-mendekikakui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
