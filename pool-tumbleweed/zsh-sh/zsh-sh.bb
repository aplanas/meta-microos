SUMMARY = "Handle behaviour of /bin/sh"
DESCRIPTION = "Use zsh as /bin/sh implementation."
LICENSE = "MIT"

PV = "5.9"

RPM_NAME = "zsh-sh-5.9-6.1.noarch.rpm"
RPM_HASH = "cc73b671d3f7974faf3b168fad4cd65717728d588c42ed22081447ff19769adc70663a05eaf789e80f2bdb086d87097196968fd68686af1a0c3d7e84a577589e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
zsh-sh"

RDEPENDS:${PN} += "zsh"

inherit rpm
