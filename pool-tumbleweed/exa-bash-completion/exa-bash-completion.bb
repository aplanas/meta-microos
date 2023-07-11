SUMMARY = "Bash Completion for exa"
DESCRIPTION = "Bash command line completion support for exa."
LICENSE = "MIT"

PV = "0.10.1"

RPM_NAME = "exa-bash-completion-0.10.1-3.5.noarch.rpm"
RPM_HASH = "240061a3aed74ba1c89324235417c7d27daa59c1d00104bd0400f78a895f2096884b3d0b556f1e3c742525a88faca2ddf2b9bdceccd6a13bae8ae2f078219e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "exa-bash-completion"

RDEPENDS:${PN} += "exa"

inherit rpm
