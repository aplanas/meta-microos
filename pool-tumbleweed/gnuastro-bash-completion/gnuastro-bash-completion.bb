SUMMARY = "Bash completion for gnuastro"
DESCRIPTION = "Bash command line completion support for gnuastro"
LICENSE = "GPL-3.0-or-later"

PV = "0.20"

RPM_NAME = "gnuastro-bash-completion-0.20-1.1.noarch.rpm"
RPM_HASH = "69d29fd868f5098b95f3df21a4733b2f00fc585419949ace75344c8f4c4c580434ef2654d6d8c60a4f1f83401f22618d381a059e900ef72139a6bcd48278f04a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuastro-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
