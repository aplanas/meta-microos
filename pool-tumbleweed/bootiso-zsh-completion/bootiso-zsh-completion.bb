SUMMARY = "ZSH Completion for bootiso"
DESCRIPTION = "ZSH command line completion support for bootiso."
LICENSE = "GPL-3.0-only"

PV = "4.2.0"

RPM_NAME = "bootiso-zsh-completion-4.2.0-2.8.noarch.rpm"
RPM_HASH = "1335aaaba8435a02d2771ef2105858445dafc7a37acf768e3be1c18f4f22bccbba5c1fe22353226db6f5f06b4a0de6e4c75be86e6db014ecf47941fa272109fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bootiso-zsh-completion"

RDEPENDS:${PN} += "bootiso"

inherit rpm
