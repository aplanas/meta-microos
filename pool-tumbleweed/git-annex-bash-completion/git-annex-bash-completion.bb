SUMMARY = "Bash completion for git-annex"
DESCRIPTION = "Optional dependency offering bash completion for git-annex"
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & BSD-2-Clause & MIT & GPL-2.0-only"

PV = "10.20230802"

RPM_NAME = "git-annex-bash-completion-10.20230802-1.1.aarch64.rpm"
RPM_HASH = "2e4796f7dde9f0d037a3259457d3bc2ca308bd7cd5a126890fa9ee877968883e6e45733a5c194ac2906ac59be78e5ce196dfc7e350b3cfbadd0fcc6af922b088"

RPROVIDES:${PN} += "git-annex-bash-completion"

RDEPENDS:${PN} += "bash-completion \
git-annex"

inherit rpm
