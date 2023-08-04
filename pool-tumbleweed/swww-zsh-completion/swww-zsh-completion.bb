SUMMARY = "Zsh Completion for swww"
DESCRIPTION = "Zsh command-line completion support for swww."
LICENSE = "GPL-3.0-only"

PV = "0.8.1"

RPM_NAME = "swww-zsh-completion-0.8.1-1.1.noarch.rpm"
RPM_HASH = "5fc6403c3130084cd95a415106b33f6244407a3b0243769ec3b65b48e2c34da9e02700e4956a8cec238ec14ec8ff0d6c3fb10221934e2b47ee60afd9d485082b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "swww-zsh-completion"

RDEPENDS:${PN} += "zsh"

inherit rpm
