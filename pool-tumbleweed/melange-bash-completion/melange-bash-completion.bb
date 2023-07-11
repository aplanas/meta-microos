SUMMARY = "Bash Completion for melange"
DESCRIPTION = "Bash command line completion support for melange."
LICENSE = "Apache-2.0"

PV = "0.3.2"

RPM_NAME = "melange-bash-completion-0.3.2-1.3.noarch.rpm"
RPM_HASH = "bc3e81da3c28ece59da3aa7e7a6bb2c229989cdbfd35db00b9713860e7ab4b32163c0c16b6300ef8e2b3e8b69c3cde14b4a1c64c1ea5a48ba83a7275ce374fac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "melange-bash-completion"

RDEPENDS:${PN} += "melange"

inherit rpm
