SUMMARY = "Bash completion for git-annex"
DESCRIPTION = "Optional dependency offering bash completion for git-annex"
LICENSE = "AGPL-3.0-or-later & GPL-3.0-or-later & BSD-2-Clause & MIT & GPL-2.0-only"

PV = "10.20230828"

RPM_NAME = "git-annex-bash-completion-10.20230828-1.1.aarch64.rpm"
RPM_HASH = "d6682a7c89061630cf0e8d6401795f0d949603037efa15033e48acff0953561db015a48652a85b0e7c70642731f0f3571f330d1373cc3223dcb7a6d8cc09539f"

RPROVIDES:${PN} += "git-annex-bash-completion"

RDEPENDS:${PN} += "bash-completion \
git-annex"

inherit rpm
