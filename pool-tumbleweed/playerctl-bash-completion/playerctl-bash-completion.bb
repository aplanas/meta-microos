SUMMARY = "Bash completion for playerctl"
DESCRIPTION = "Bash command line completion support for playerctl."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-bash-completion-2.4.1-1.9.noarch.rpm"
RPM_HASH = "48343d1a4c5bd5f49e4fe2277b247ee6ab0a81980c4126c86d99f33497bfbbaaaf198d40c6a8ffa297e20da76631e4f13a05206c5ecbc0e1d200d002ab600cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "playerctl-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
