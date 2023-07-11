SUMMARY = "Noto Oriya Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Oriya Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-oriya-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "ef7b334dda31bda0de5258ea8acf1deebde8967cd934690a980a774dfa2580f65e7113b8c70074400fa0c37302f7eb503e696b122f6160b78ca84b061b22787e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-oriya \
noto-serif-oriya-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
