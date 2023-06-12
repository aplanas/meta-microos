SUMMARY = "Bash Completion for flameshot"
DESCRIPTION = "Bash completion script for flameshot's CLI."
LICENSE = "GPL-3.0-only"

PV = "12.1.0"

RPM_NAME = "flameshot-bash-completion-12.1.0-2.1.noarch.rpm"
RPM_HASH = "7011b5aa14b0d8eacf015747d565483174f45e2ba824738c025098fe471b32bc89853215d586fad949e24201bed0cb3a33e7461493253995dfe2803247c3930a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flameshot-bash-completion"
RDEPENDS:${PN} += "bash-completion flameshot"

inherit rpm
