SUMMARY = "Bash completion for mbimcli"
DESCRIPTION = "This package contain de bash completion command for mbimcli tools."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.28.4"

RPM_NAME = "mbimcli-bash-completion-1.28.4-1.1.noarch.rpm"
RPM_HASH = "1f62b7b2c821acc83081622b04bfeb674ea47551f6f019fa890245deca72957733e41182c58ab0a5bd5814b586bf98b7c2527631bc59f0d28a089c9ce73d2e3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mbimcli-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
