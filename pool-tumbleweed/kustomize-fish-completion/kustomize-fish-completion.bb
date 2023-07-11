SUMMARY = "Fish Completion for kustomize"
DESCRIPTION = "Fish command line completion support for kustomize."
LICENSE = "Apache-2.0"

PV = "4.5.7"

RPM_NAME = "kustomize-fish-completion-4.5.7-1.4.noarch.rpm"
RPM_HASH = "aeab77c98c3c0570530a098832d2fc26b74fdf74f733466ccc1905b71e0427b06e6fbada4244fb993bac3ed6b978e483bb69387ad4790a9603a2c9c762f8cdc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kustomize-fish-completion"

RDEPENDS:${PN} += "kustomize"

inherit rpm
