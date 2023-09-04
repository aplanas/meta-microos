SUMMARY = "Bash Completion for skaffold"
DESCRIPTION = "Bash command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.6.3"

RPM_NAME = "skaffold-bash-completion-2.6.3-1.1.noarch.rpm"
RPM_HASH = "c05601019474ca653f9fced1fee56d3e8f01f6943f2566e6c8f90fc53ca341b224c1b6d502eb46c5f0dc81ecd1ceb1d3d11218bc11b6d9369297b0fafaa7a5aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-bash-completion"

RDEPENDS:${PN} += "bash-completion \
skaffold"

inherit rpm
