SUMMARY = "Bash completion for git-annex"
DESCRIPTION = "Optional dependency offering bash completion for git-annex"
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & BSD-2-Clause & MIT & GPL-2.0-only"

PV = "10.20230407"

RPM_NAME = "git-annex-bash-completion-10.20230407-2.2.aarch64.rpm"
RPM_HASH = "123dc34dc74a33afd2741313cee86debff8b43d70167e1003b0947d985ce162be8b19aaf9ca404e812823fb0c416f22102652f6690f6342a5c9346ce2e2e9ef6"

RPROVIDES:${PN} += "git-annex-bash-completion"

RDEPENDS:${PN} += "bash-completion \
git-annex"

inherit rpm
