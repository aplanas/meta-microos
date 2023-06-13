SUMMARY = "Bash Completion for bootiso"
DESCRIPTION = "Bash command line completion support for bootiso."
LICENSE = "GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "bootiso-bash-completion-4.2.0-2.8.noarch.rpm"
RPM_HASH = "aec7975a9e72a2ea715dbe99f83854999b004aaa67a9a35c8fc7cc9b2736346f3ef7be56e87f6c53b8d259d4583883742cafc7418ab75ff3f1674420e67c512a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bootiso-bash-completion"

RDEPENDS:${PN} += "bash-completion \
bootiso"

inherit rpm
