SUMMARY = "Bash Completion for pluto"
DESCRIPTION = "Bash command line completion support for pluto."
LICENSE = "Apache-2.0"

PV = "5.18.1"

RPM_NAME = "pluto-bash-completion-5.18.1-1.1.noarch.rpm"
RPM_HASH = "718d9526047cf77a938d70e114808d1c63d4c65e2891e50cb8aa5c956e1d5cf74b4b419052d9ff5884c2c2912b5b2f26e49bb54767bcb36020f8792fbec834db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pluto-bash-completion"

RDEPENDS:${PN} += "pluto"

inherit rpm
