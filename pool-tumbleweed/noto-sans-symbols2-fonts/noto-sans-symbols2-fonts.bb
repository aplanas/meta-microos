SUMMARY = "Noto Symbols2 Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Symbols2 Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-symbols2-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "352e1ad323ac4e7eebbbc17b424854317dcdaf1ab4e433d2eac029a3380e3109bad1cb5939bfc8156f22f6dbe9cef1d19449757471b92b083754c23a8f80b7cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-symbols2 \
noto-sans-symbols2-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
