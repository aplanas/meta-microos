SUMMARY = "Zsh Completion for timoni"
DESCRIPTION = "zsh command line completion support for timoni."
LICENSE = "Apache-2.0"

PV = "0.10.0"

RPM_NAME = "timoni-zsh-completion-0.10.0-1.1.noarch.rpm"
RPM_HASH = "aa8cffda922c810917f026aac560e1a2e65e3367520be23f98f871fafc25871ce2a2c3142860feeb1fe3edb2ebfc50c008d62593e49dcfd6c19f9b76e8f9eb1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timoni-zsh-completion"

RDEPENDS:${PN} += "timoni"

inherit rpm
