SUMMARY = "Vagrant bash autocompletion"
DESCRIPTION = "Optional dependency offering bash completion for vagrant"
LICENSE = "MIT"

PV = "2.3.4"

RPM_NAME = "vagrant-bash-completion-2.3.4-4.1.noarch.rpm"
RPM_HASH = "1af784321fb047a0060aeb8114e0eb2df7255c8f27963067dc16cd122467c8efc15f5cd33cabf97e894cc86f25f9468f08a2ff0d21468b252ddb6cb33160e401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vagrant-bash-completion"

RDEPENDS:${PN} += "bash \
bash-completion \
vagrant"

inherit rpm
