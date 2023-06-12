SUMMARY = "Bash completions for nnn"
DESCRIPTION = "The official bash completion script for nnn."
LICENSE = "BSD-2-Clause"

PV = "4.8"

RPM_NAME = "nnn-bash-completion-4.8-1.1.noarch.rpm"
RPM_HASH = "fd705299c1b7a99405aa0ad52a791d071a84e2a66bda9571100ac0d71f7c925d4e7575dd328635b6ec4c1d9080a9bad4916fd75c81a4165d4353bfeebdc23e9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nnn-bash-completion"
RDEPENDS:${PN} += "bash-completion"

inherit rpm
