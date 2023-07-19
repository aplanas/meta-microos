SUMMARY = "Bash Completion for helm"
DESCRIPTION = "Bash command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.12.2"

RPM_NAME = "helm-bash-completion-3.12.2-1.1.noarch.rpm"
RPM_HASH = "295d6769f214dd987b818d536bbd7b96cf376fe557ffc09743c031a702efadeed8fbfb5a9643dfe6ee2187e10bdec50ef62b817b874b535f7431a9b80250b69d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-bash-completion"

RDEPENDS:${PN} += "helm"

inherit rpm
