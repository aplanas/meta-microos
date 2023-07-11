SUMMARY = "Fish Completion for zellij"
DESCRIPTION = "Fish command-line completion support for zellij."
LICENSE = "MIT"

PV = "0.37.2"

RPM_NAME = "zellij-fish-completion-0.37.2-1.1.noarch.rpm"
RPM_HASH = "422c3a111fbec5627aae483f9297b214eabe3359aa3b4b995ee411746909bec56f0e89863fbe18643f131a8663d06cb4a7ec5befc3a0dc2c98758e5ff4372ec2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "zellij-fish-completion"

RDEPENDS:${PN} += "fish"

inherit rpm
