SUMMARY = "Bash Completion for skaffold"
DESCRIPTION = "Bash command line completion support for skaffold."
LICENSE = "Apache-2.0"

PV = "2.6.2"

RPM_NAME = "skaffold-bash-completion-2.6.2-1.1.noarch.rpm"
RPM_HASH = "48232d23fe6e5fcbd6b86522b86ba06f0f9e4a1bfba43ba38547a705aab4935fdb3004dc682e14cfecb130de51bf0ef80207da3ed58e4ce8a4036e7cc5bb2b87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "skaffold-bash-completion"

RDEPENDS:${PN} += "bash-completion \
skaffold"

inherit rpm
