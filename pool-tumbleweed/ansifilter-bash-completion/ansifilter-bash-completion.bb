SUMMARY = "Bash completion for ansifilter"
DESCRIPTION = "This package provides Bash command-line completion support for ansifilter."
LICENSE = "GPL-3.0-or-later"

PV = "2.19"

RPM_NAME = "ansifilter-bash-completion-2.19-1.3.noarch.rpm"
RPM_HASH = "60a0335459c57507e13639c0f37d49721c7928c8878a151491f90c964b10884cda2acdee2f932b66e5c4d0404b0b7dc042651631cce451c85732cf693b0eb2a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ansifilter-bash-completion"
RDEPENDS:${PN} += "ansifilter \
bash-completion"

inherit rpm
