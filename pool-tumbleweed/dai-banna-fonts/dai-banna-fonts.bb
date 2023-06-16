SUMMARY = "SIL New Tai Lue Font"
DESCRIPTION = "Dai Banna SIL is a Unicode font package for rendering New Tai Lue \
(Xishuangbanna Dai) characters."
LICENSE = "OFL-1.1"

PV = "3.000"

RPM_NAME = "dai-banna-fonts-3.000-1.4.noarch.rpm"
RPM_HASH = "81ac613591f95bef2dbbb5701777ada78defd2dca5b2bce56d6ff8275a82067d92c459c79999ae327347dcfec59b24197af04945337cdc34690661ad92d86395"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dai-banna-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
