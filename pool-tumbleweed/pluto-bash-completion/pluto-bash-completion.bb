SUMMARY = "Bash Completion for pluto"
DESCRIPTION = "Bash command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.18.0"

RPM_NAME = "pluto-bash-completion-5.18.0-1.1.noarch.rpm"
RPM_HASH = "dff1f245990de27dbe5515df1bb68d6f5b03d8ad1856e213ee31af82b06dc9291caed2dae3eb9efabc2c876988c9f05d156fbd815239143ea43820f92775ccae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-bash-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
