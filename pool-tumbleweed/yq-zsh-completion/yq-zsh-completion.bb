SUMMARY = "Zsh Completion for yq"
DESCRIPTION = "Zsh command line completion support for yq."
LICENSE = "MIT"

PV = "4.33.3"

RPM_NAME = "yq-zsh-completion-4.33.3-1.2.noarch.rpm"
RPM_HASH = "1112d970cf947452e8b82aefb4115b4b42ad414f5b2b0d5a6750a53e55c7cd12f1aa7e67336e71d5cd9e54e10e348a06a98cc944b2dccd1f1f6a9013cf94273c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "yq-zsh-completion"

RDEPENDS:${PN} += "yq"

inherit rpm
