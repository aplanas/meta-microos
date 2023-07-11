SUMMARY = "Bash Completion for subversion"
DESCRIPTION = "Bash command line completion support for subversion - completion of subcommands, \
parameters and keywords for the svn command and other tools."
LICENSE = "Apache-2.0"

PV = "1.14.2"

RPM_NAME = "subversion-bash-completion-1.14.2-6.1.noarch.rpm"
RPM_HASH = "476710e3bfab6993f330b269b54b0c6e54e3b2dab60ae9de38195824e5767b257d33a5ef45f7dfbb66f5e407b75305d3f3a06070a19f81f8d2f4a7bea3d04a2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "subversion-bash-completion"

RDEPENDS:${PN} += "bash-completion \
subversion"

inherit rpm
