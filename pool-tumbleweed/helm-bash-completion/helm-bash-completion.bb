SUMMARY = "Bash Completion for helm"
DESCRIPTION = "Bash command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.12.1"

RPM_NAME = "helm-bash-completion-3.12.1-1.1.noarch.rpm"
RPM_HASH = "1a41e92880aab0c9fd5550185fb8ad49d27d6680ae647ed60c18336eddb25cc434498b0f5f4640f23e635b46432a40559281a3e70a910a049fc22075ee0163b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-bash-completion"

RDEPENDS:${PN} += "helm"

inherit rpm
