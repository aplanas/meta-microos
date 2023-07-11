SUMMARY = "Vagrant bash autocompletion"
DESCRIPTION = "Optional dependency offering bash completion for vagrant"
LICENSE = "MIT"

PV = "2.3.7"

RPM_NAME = "vagrant-bash-completion-2.3.7-1.1.noarch.rpm"
RPM_HASH = "ecbd9f7a1d116194bc9f18236e51f7dea52149feea80d3ac4c7b830e4336d5ba6f46df0fad81bcbc4c011c6b330c9d0bb18e9bd71af978941d19dd3f2108e8dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vagrant-bash-completion"

RDEPENDS:${PN} += "bash \
bash-completion \
vagrant"

inherit rpm
