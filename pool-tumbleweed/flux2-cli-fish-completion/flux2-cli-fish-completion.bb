SUMMARY = "Fish Completion for flux2-cli"
DESCRIPTION = "Fish command line completion support for flux2-cli."
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "flux2-cli-fish-completion-2.1.0-1.1.noarch.rpm"
RPM_HASH = "ce8788dc1c4c6e60d161ea5da9e5151e95353ebc627176da607034c50a4981a54e7994f2c456750ed8f4e31538ccf1f3bf38354df1d3e27d387dcc61b7119069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "flux2-cli-fish-completion"

RDEPENDS:${PN} += "flux2-cli"

inherit rpm
