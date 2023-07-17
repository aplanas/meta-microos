SUMMARY = "Bash Completion for flux2-cli"
DESCRIPTION = "Bash command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "flux2-cli-bash-completion-2.0.1-1.1.noarch.rpm"
RPM_HASH = "9a00d1a3d371910ca86bbc80d856739113926747b72bc0cf541d9424e743cb24d6b8c7d5e31d5f837bfeb7d07560ae825016fc3de3721ab97f75c12ad0bd8aee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-bash-completion"

RDEPENDS:${PN} += "bash-completion \
flux2-cli"

inherit rpm
