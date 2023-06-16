SUMMARY = "Noto Thaana Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Thaana Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-thaana-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "f2699e42c856239dd306901270b6fe4f248d41141ecdca6d2de9c5424ed1d9320f7a00387140764a847f8b28bc9876674451785f670a9dd5a2fe02daed35dbf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-thaana \
noto-sans-thaana-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
