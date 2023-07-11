SUMMARY = "Noto Looped Thai Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
LoopedThai font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-loopedthai-ui-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "072d007fce5b88ea98f38979b47f8eb10c7148763b90b95f212c4ca621267ec61d045a297ef58a99eb72a295f3b0443b7c476f12a95ebed23d60f9678b22cd9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-loopedthai-ui \
noto-loopedthai-ui-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
