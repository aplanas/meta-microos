SUMMARY = "Dina Programming Font"
DESCRIPTION = "Dina is a monospace bitmap font, primarily aimed at programmers. \
It is relatively compact to allow a lot of code on screen, \
while (hopefully) clear enough to remain readable even at high resolutions."
LICENSE = "MIT"

PV = "2.92.0"

RPM_NAME = "dina-bitmap-fonts-2.92.0-2.14.noarch.rpm"
RPM_HASH = "a478db2f574b8977f71ab26884536d255748f14b2368e45b751fdee6f31ad952e8bd817baa5e942a5825a28ee052171d11d59e6147b8f3ec736d8f988e463f29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dina-bitmap-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
