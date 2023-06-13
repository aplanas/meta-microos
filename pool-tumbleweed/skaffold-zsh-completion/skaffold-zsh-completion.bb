SUMMARY = "Zsh Completion for skaffold"
DESCRIPTION = "zsh command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "skaffold-zsh-completion-2.5.0-1.1.noarch.rpm"
RPM_HASH = "8b431f84fbd5307b24ef2da9cccf9651cbfffe51e883b96cb93de26e713d650fefe7794c4b3a449664a42b1b82584cf03144ebbb54c0449feacdff20813cd4e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-zsh-completion"

RDEPENDS:${PN} += "skaffold"

inherit rpm
