SUMMARY = "Bash Completion for subversion"
DESCRIPTION = "Bash command line completion support for subversion - completion of subcommands, \
parameters and keywords for the svn command and other tools."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-bash-completion-1.14.2-6.2.noarch.rpm"
RPM_HASH = "f2c11e6a3321240775db708f326ddce022b8a1b62fdcc92973d22f49f431c1d3ded2b04964a414af52693ae25b33c999410cbf715855d01edc4b6309f0a53c64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subversion-bash-completion"

RDEPENDS:${PN} += "bash-completion \
subversion"

inherit rpm
