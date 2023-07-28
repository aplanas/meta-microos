SUMMARY = "Bash completion for git-annex"
DESCRIPTION = "Optional dependency offering bash completion for git-annex"
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & BSD-2-Clause & MIT & GPL-2.0-only"

PV = "10.20230626"

RPM_NAME = "git-annex-bash-completion-10.20230626-1.1.aarch64.rpm"
RPM_HASH = "0975f1f923cc7d3ebeec4641ebaaa56806ad273d03060922ac08d3333c81b69f6b4fd416cef02c7384a5aea67b1ffb51fc8e81e63734b2f5a618e44568914c62"

RPROVIDES:${PN} += "git-annex-bash-completion"

RDEPENDS:${PN} += "bash-completion \
git-annex"

inherit rpm
