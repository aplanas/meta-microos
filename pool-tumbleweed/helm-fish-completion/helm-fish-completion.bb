SUMMARY = "Fish Completion for helm"
DESCRIPTION = "Fish command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "helm-fish-completion-3.12.0-1.1.noarch.rpm"
RPM_HASH = "e6fc61d4155508e179e1f9c02cbdfa0d4d7ecd1011ced8d0402794c60b2e3d8acdbf2eb801e7cd84c9753c3c97940a495f34786e9ceef551669f4a616b7738ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-fish-completion"

RDEPENDS:${PN} += "helm"

inherit rpm
