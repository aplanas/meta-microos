SUMMARY = "JetBrains Mono: a typeface for developers"
DESCRIPTION = "A typeface made for developers. \
 \
Designer: Philipp Nurullin"
LICENSE = "OFL-1.1"

PV = "2.304"

RPM_NAME = "jetbrains-mono-fonts-2.304-1.2.noarch.rpm"
RPM_HASH = "a2acabea9dbaa1d1055132aabc3ec039ab17259d2528576c56557275323de7ea8eaae82488600afd6d4319c818ca6ab3f003294bde5672869c695f58e6b650fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jetbrains-mono-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
