SUMMARY = "Bash completion for dust"
DESCRIPTION = "Bash command line completion support for dust."
LICENSE = "Apache-2.0"

PV = "0.8.6"

RPM_NAME = "dust-bash-completion-0.8.6-1.2.noarch.rpm"
RPM_HASH = "6c398574e31e3cab3210573c3d22f30f14cc9049624ea6af4d7d3f239b670af1c0a7d7cb59b92f97b3d1c311a5b39c25d3732ed58a8b87a57164e2be558320fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dust-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
