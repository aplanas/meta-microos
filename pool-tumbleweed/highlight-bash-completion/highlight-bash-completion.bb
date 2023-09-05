SUMMARY = "Bash completion for highlight"
DESCRIPTION = "This package provides Bash command-line completion support for highlight."
LICENSE = "GPL-3.0-or-later"

PV = "4.8"

RPM_NAME = "highlight-bash-completion-4.8-1.1.noarch.rpm"
RPM_HASH = "c4ae1f95decefd6f5e9645985987f1c57aa109e973c867dd3a13180f1a135405348233be33e1401a34864276bef5f2b10bc7cbdfe31c3cf76359f2e5f6191f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "highlight-bash-completion"

RDEPENDS:${PN} += "bash-completion \
highlight"

inherit rpm
