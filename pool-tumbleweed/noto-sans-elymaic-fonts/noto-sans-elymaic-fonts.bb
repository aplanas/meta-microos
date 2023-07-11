SUMMARY = "Noto Elymaic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Elymaic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-elymaic-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "a28c28a88b22a1a37a40613b7e208139ff43002f24e1957c763366b3026f03320c8136caa25efc414993ab7b4db883f4d1fdd18a578af179208d5d1f87b681c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-elymaic \
noto-sans-elymaic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
