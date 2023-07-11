SUMMARY = "Bash completion for skopeo"
DESCRIPTION = "This package contains the bash completion for skopeo."
LICENSE = "Apache-2.0"

PV = "1.12.0"

RPM_NAME = "skopeo-bash-completion-1.12.0-1.2.noarch.rpm"
RPM_HASH = "3371b9ab5235c453f0982bff6b6f81680a6bb20fd797c0808e50c45675a39e87f02b8b4ec8b2091c4881f6fca0758324af0df5b8819273c78654a2922c82d0b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skopeo-bash-completion"

RDEPENDS:${PN} += "bash-completion \
skopeo"

inherit rpm
