SUMMARY = "Noto Bhaiksuki Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Bhaiksuki Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-bhaiksuki-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "1503c8bb1cb2c4ff0fe69627900602b09c7f0803df21e6c1568abaf75565ba033c450fd40fa633ae0a6cff425d590e5b636d80bc08dfafdefba098cb5b4be64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-bhaiksuki \
noto-sans-bhaiksuki-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
