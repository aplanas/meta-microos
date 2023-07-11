SUMMARY = "Handle behaviour of /bin/sh"
DESCRIPTION = "Use zsh as /bin/sh implementation."
LICENSE = "MIT"

PV = "5.9"

RPM_NAME = "zsh-sh-5.9-5.4.noarch.rpm"
RPM_HASH = "333312663b415e9335767a105a4dc5267ffc30466abed6b8fd01736a153696bef85bde26044b13f47b1a1aa0728f58b59ce0db9151308f85347d251f4e379802"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/usr/bin/sh \
alternative-sh \
zsh-sh"

RDEPENDS:${PN} += "zsh"

inherit rpm
