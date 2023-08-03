SUMMARY = "Godot command line completion for Bash"
DESCRIPTION = "Bash command line completion support for godot and godot-runner"
LICENSE = "MIT"

PV = "4.1.1"

RPM_NAME = "godot-bash-completion-4.1.1-1.1.noarch.rpm"
RPM_HASH = "c3c894793004e404188ce8afe7d1a716d3144daf2016543019ec51739b43b6777466ae54610a90ae5ddfa5d98a55857bcd5815f7e1d68d10e3d3e21258cb52aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "godot-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
