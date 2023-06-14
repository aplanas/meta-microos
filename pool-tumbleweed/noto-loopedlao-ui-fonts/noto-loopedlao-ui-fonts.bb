SUMMARY = "Noto Looped Lao Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LoopedLao font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-loopedlao-ui-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "f026693eaa30fe7984d919121b107f6f5c61f668e44a4d76d7466351b6567dbaf1cdd365017b5c740aa57e49e79e895f5701fedc7cdbcb62896743fd46576d3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-loopedlao-ui \
noto-loopedlao-ui-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
