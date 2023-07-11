SUMMARY = "Bash completion for PDAL"
DESCRIPTION = "This package contain the bash completion command for PDAL."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.3.0"

RPM_NAME = "PDAL-bash-completion-2.3.0-2.16.noarch.rpm"
RPM_HASH = "ecd1a82c31b28845cd1dab39de830a5931ba340ae61fe4a1ceb7f9de3a7f8969234c7c50aa6ff11fc4d92a857f9aef32a7de6331b601894f941be596a7aa16fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PDAL-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
