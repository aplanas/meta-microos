SUMMARY = "Bash completion for PDAL"
DESCRIPTION = "This package contain the bash completion command for PDAL."
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT & BSL-1.0"

PV = "2.3.0"

RPM_NAME = "PDAL-bash-completion-2.3.0-2.15.noarch.rpm"
RPM_HASH = "789b106797d9063ee1496391768e53072d4b19ab7f7810d3f444bc67a262bf347fc078f58f6e6aa8554186f4cbac64e9bb279ebf63212de82e084b5071b85bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "PDAL-bash-completion"

RDEPENDS:${PN} += "bash-completion"

inherit rpm
