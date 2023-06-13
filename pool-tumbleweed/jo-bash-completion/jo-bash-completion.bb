SUMMARY = "Bash Completion for jo"
DESCRIPTION = "Bash completion script for jo."
LICENSE = "GPL-2.0-or-later & MIT"

PV = "1.9"

RPM_NAME = "jo-bash-completion-1.9-1.2.noarch.rpm"
RPM_HASH = "2319976fc1ef13ca92cb179862859d402cb70982e38a1f81cd15bed146eadfc93041afbd468bc54a3a897261a3b7c2b863de49ab6f0cb6fb7c23947114102de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jo-bash-completion"

RDEPENDS:${PN} += "bash-completion \
jo"

inherit rpm
