SUMMARY = "Crispy Doom command line completion support for bash"
DESCRIPTION = "Additions for bash-completion to support crispy-doom."
LICENSE = "GPL-2.0-or-later"

PV = "5.12.0"

RPM_NAME = "crispy-doom-bash-completion-5.12.0-1.1.noarch.rpm"
RPM_HASH = "7514edaaf8a668fe545f3e914fb99c58a85895f80f7ad92fc5692c8595565a743f16d33cc7bd16f1d1f6151d3841a0a35866cbf8ac65475b65a219394f30386a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "crispy-doom-bash-completion"

RDEPENDS:${PN} += ""

inherit rpm
