SUMMARY = "Bash Completion for flux2-cli"
DESCRIPTION = "Bash command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.0.0~rc4"

RPM_NAME = "flux2-cli-bash-completion-2.0.0~rc4-1.1.noarch.rpm"
RPM_HASH = "88a53d30db4c18f1b399d27e043a033b3f37029039afd51160ed3ca013ec3e5167a5696ec698ee00fee3a17097f506554d6848c4dab5033eb1cab478861b4db3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
flux2-cli"

inherit rpm
