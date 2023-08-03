SUMMARY = "Bash Completion for timoni"
DESCRIPTION = "Bash command line completion support for timoni."
LICENSE = "Apache-2.0"

PV = "0.11.1"

RPM_NAME = "timoni-bash-completion-0.11.1-1.1.noarch.rpm"
RPM_HASH = "31c4c077d5db063affde4b0918ef7bf1751ada85c397975c394e2862ef56b08f56d83e0f09e83eb7c7acc65646a80c3932211237c321a1bffdcce2a2a0c0364f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timoni-bash-completion"

RDEPENDS:${PN} += "bash-completion \
timoni"

inherit rpm
