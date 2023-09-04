SUMMARY = "Bash Completion for zola"
DESCRIPTION = "Bash command-line completion support for zola."
LICENSE = "MIT"

PV = "0.17.2"

RPM_NAME = "zola-bash-completion-0.17.2-3.1.noarch.rpm"
RPM_HASH = "77ccc4fd8dc8d817dfb579bf2402ec2356907a03f6a022924ec65091af5a257c49729517aad644ad0724e3d8c089c186bf7dba8e73b290192d401836b10c1579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zola-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
