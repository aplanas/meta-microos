SUMMARY = "Bash Completion for yq"
DESCRIPTION = "Bash command line completion support for yq."
LICENSE = "MIT"

PV = "4.33.3"

RPM_NAME = "yq-bash-completion-4.33.3-1.3.noarch.rpm"
RPM_HASH = "a01d99ef053f9efe6c8e97fe41d9fc3e43664fd62f2e3d85aa217b0d5c9c4edce38a4c78b3f9b03e6f84faeb1e5de3e6f5f2db777b26e90321f51ee95320b6c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-bash-completion"

RDEPENDS:${PN} += "yq"

inherit rpm
