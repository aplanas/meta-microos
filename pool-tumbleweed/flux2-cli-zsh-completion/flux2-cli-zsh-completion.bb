SUMMARY = "Zsh Completion for flux2-cli"
DESCRIPTION = "zsh command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "flux2-cli-zsh-completion-2.1.0-1.1.noarch.rpm"
RPM_HASH = "b85b094161bf91069a3b202c71b13014db5744154c0d18c807aed7b6b01df43b514600692a0cf6487d8b470342be3877d63ee30e7eb5afe18f1f553be7a2ee0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-zsh-completion"

RDEPENDS:${PN} += "flux2-cli"

inherit rpm
