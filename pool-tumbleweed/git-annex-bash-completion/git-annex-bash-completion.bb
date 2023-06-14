SUMMARY = "Bash completion for git-annex"
DESCRIPTION = "Optional dependency offering bash completion for git-annex"
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & BSD-2-Clause & MIT & GPL-2.0-only"

PV = "10.20230407"

RPM_NAME = "git-annex-bash-completion-10.20230407-1.2.aarch64.rpm"
RPM_HASH = "c6a8e9f29644e0f084fe09051e98cd0b393b6531d9845872ed4bb186581977a8aea4c19bef8171c031394b44f9c8babfeef47e6cc721bb5a8527d86abfedda8a"

RPROVIDES:${PN} += "git-annex-bash-completion"

RDEPENDS:${PN} += "bash-completion \
git-annex"

inherit rpm
