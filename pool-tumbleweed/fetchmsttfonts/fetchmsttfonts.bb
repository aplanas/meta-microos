SUMMARY = "Helper package to download Microsoft Core fonts for the Web"
DESCRIPTION = "This package contains a helper script that downloads and installs \
a number of TrueType fonts collectively known as corefonts, or the \
Core fonts for the Web. Originally made available my Micosoft under \
a non-free End-user licence agreement (EULA), they continue to be \
distributed subject to the same licence terms. The user is shown \
a copy of the licence text upon execution. \
 \
The Core fonts for the Web include: Arial, Arial Black, Andale Mono, \
Monotype, Courier New, Comic Sans MS, Georgia, Impact, Times New \
Roman, Trebuchet MS, Verdana, Webdings."
LICENSE = "GPL-2.0-or-later"

PV = "12.0"

RPM_NAME = "fetchmsttfonts-12.0-1.8.noarch.rpm"
RPM_HASH = "0a9aa7a2da12e975a65898b845990486ca61097c5c9a5fbc8871ee65fd8a1ad885656be73890d196b0c90a71545f1c11bf9dfe3ec7c6f3ddd112999d9c4619f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fetchmsttfonts"
RDEPENDS:${PN} += "/bin/sh \
/usr/sbin/fonts-config \
cabextract \
coreutils \
curl \
fonts-config \
mktemp \
w3m"

inherit rpm
