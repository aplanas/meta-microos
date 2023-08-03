SUMMARY = "Zsh Completion for kubesec"
DESCRIPTION = "zsh command line completion support for kubesec."
LICENSE = "Apache-2.0"

PV = "2.13.0"

RPM_NAME = "kubesec-zsh-completion-2.13.0-1.1.noarch.rpm"
RPM_HASH = "878e30f41a36dd5bea965651c8a547b6fca01bafc70608e7d75a79972a77fcd5c1cfa7477027eee3b8e1346ce8835e4cca7bdee3148dd2eebbb87e6b8314ba7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubesec-zsh-completion"

RDEPENDS:${PN} += "kubesec"

inherit rpm
