SUMMARY = "Bash completion for swaylock"
DESCRIPTION = "Bash command line completion support for swaylock."
LICENSE = "MIT"

PV = "1.7.2"

RPM_NAME = "swaylock-bash-completion-1.7.2-1.1.noarch.rpm"
RPM_HASH = "bc5321f730aa0a4b954d876dca5e999293b65ebaa20b54818eb2d0ef00616f932f9e25f0fa7eb4e4fbc00a14f089a95c04a66154cb27fc8544ff1ae2b6a64198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swaylock-bash-completion"
RDEPENDS:${PN} += "swaylock"

inherit rpm
