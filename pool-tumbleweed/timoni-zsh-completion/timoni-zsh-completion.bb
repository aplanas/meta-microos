SUMMARY = "Zsh Completion for timoni"
DESCRIPTION = "zsh command line completion support for timoni."
LICENSE = "Apache-2.0"

PV = "0.12.1"

RPM_NAME = "timoni-zsh-completion-0.12.1-1.1.noarch.rpm"
RPM_HASH = "8b23ef8a36ca890dc8780450c07ec2a81142200fdbaa06054120fff897eb80257b68b68ce44a244b0f40df3ca66e71c34e5446c6e043f630da0b82a7c434d24a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timoni-zsh-completion"

RDEPENDS:${PN} += "timoni"

inherit rpm
