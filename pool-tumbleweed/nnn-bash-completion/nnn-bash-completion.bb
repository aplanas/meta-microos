SUMMARY = "Bash completions for nnn"
DESCRIPTION = "The official bash completion script for nnn."
LICENSE = "BSD-2-Clause"

PV = "4.8"

RPM_NAME = "nnn-bash-completion-4.8-1.2.noarch.rpm"
RPM_HASH = "0edc5030242c2b77394670567f08867e00e744ee78f44ae42684b64c6d996dca6724a2716cddc0021d1b66c4ade85ccdbc9ed8f6b0e741cef62557d863649729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "nnn-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
