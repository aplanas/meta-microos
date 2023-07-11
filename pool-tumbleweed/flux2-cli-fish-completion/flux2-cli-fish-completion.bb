SUMMARY = "Fish Completion for flux2-cli"
DESCRIPTION = "Fish command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.0.0"

RPM_NAME = "flux2-cli-fish-completion-2.0.0-1.1.noarch.rpm"
RPM_HASH = "26d0fc74c49935c59014bfba4b84a7e370a225f58a66ddde3ee74397eca056390a15a179e9c54421a1b1ce459101c1e2102e1d2356cc3d732d5a476d074ddbef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-fish-completion"

RDEPENDS:${PN} += "flux2-cli"

inherit rpm
