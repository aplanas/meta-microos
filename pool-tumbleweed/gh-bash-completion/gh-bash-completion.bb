SUMMARY = "Bash Completion for gh"
DESCRIPTION = "Bash command line completion support for gh."
LICENSE = "MIT"

PV = "2.31.0"

RPM_NAME = "gh-bash-completion-2.31.0-1.1.aarch64.rpm"
RPM_HASH = "2b2792e65cf14b9036fbdf4d302349b8fd1997917e13e7b317a5f9b57d2859dca1afb08c1a9a0b520f62127f71796409d101054a5f6e4dbbad70b6213f13a140"

RPROVIDES:${PN} += "gh-bash-completion"

RDEPENDS:${PN} += "bash-completion \
gh"

inherit rpm
