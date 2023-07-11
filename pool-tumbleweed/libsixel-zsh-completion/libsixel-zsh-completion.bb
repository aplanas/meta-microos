SUMMARY = "ZSH Completion for libsixel"
DESCRIPTION = "ZSH command line completion support for libsixel."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "libsixel-zsh-completion-1.10.3-1.8.noarch.rpm"
RPM_HASH = "b6583bea69db03181d116c857f5b5e794588718ff2b60daf269a735c27211c3b90f0dd485ae97607554c0f657c13d9b59acb893b33278e46be2bb7d3857dbefd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsixel-zsh-completion"

RDEPENDS:${PN} += "libsixel-utils"

inherit rpm
