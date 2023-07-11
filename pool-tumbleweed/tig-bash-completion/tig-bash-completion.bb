SUMMARY = "Bash completion for tig"
DESCRIPTION = "Bash command line completion support for tig."
LICENSE = "GPL-2.0-or-later"

PV = "2.5.8"

RPM_NAME = "tig-bash-completion-2.5.8-1.3.noarch.rpm"
RPM_HASH = "09170311a4dd15bdfbe1cee655c4cf5a085e2208d7dd888a2781ce4150a52133a7600b266d10bed996a30686e6bf361a72768d524182d41c9ed298413e65c8de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tig-bash-completion"

RDEPENDS:${PN} += "bash-completion \
tig"

inherit rpm
