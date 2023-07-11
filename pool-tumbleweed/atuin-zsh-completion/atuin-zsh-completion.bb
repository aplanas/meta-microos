SUMMARY = "Zsh completion for atuin"
DESCRIPTION = "Zsh command line completion support for atuin."
LICENSE = "MIT"

PV = "15.0.0"

RPM_NAME = "atuin-zsh-completion-15.0.0-1.1.noarch.rpm"
RPM_HASH = "a10129deade1bf953cfc034fe8155b95d05bfb325ecd200206665215e413ee99ff68c8bca97dd7ca07b83dbe35af50489270ef5032b3db25bcc1937839a2340b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "atuin-zsh-completion"

RDEPENDS:${PN} += "atuin"

inherit rpm
