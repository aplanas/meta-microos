SUMMARY = "Crispy Doom command line completion support for bash"
DESCRIPTION = "Additions for bash-completion to support crispy-doom."
LICENSE = "GPL-2.0-or-later"

PV = "6.0"

RPM_NAME = "crispy-doom-bash-completion-6.0-1.1.noarch.rpm"
RPM_HASH = "68472b6672eb32e8129634adf2f13021f49f74a8082a2ca0427306d12334870aef007cba817f095278132049691cec81854b57045a86295e6e2ca34b195ef161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crispy-doom-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
