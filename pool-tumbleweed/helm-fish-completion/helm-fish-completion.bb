SUMMARY = "Fish Completion for helm"
DESCRIPTION = "Fish command line completion support for helm."
LICENSE = "Apache-2.0"

PV = "3.12.1"

RPM_NAME = "helm-fish-completion-3.12.1-1.1.noarch.rpm"
RPM_HASH = "a90baa1fc951fc47564f600a349411aff125eedcc98d48968fd6438f3ec75fc0b30f1ccef4f883bf8e05e0cde16e692763ad6e94e65c14ca2ef47b0004e888e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "helm-fish-completion"

RDEPENDS:${PN} += "helm"

inherit rpm
