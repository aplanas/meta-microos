SUMMARY = "Documentation for libplayerctl"
DESCRIPTION = "This package provides HTML documentation for libplayerctl."
LICENSE = "LGPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "playerctl-doc-2.4.1-1.8.noarch.rpm"
RPM_HASH = "335de08a5b94e05e332c5a89564bf6ef2f5e6e3fb61dc3822368a9fa9bb7203366b6c9617b155e08b1f434a216b62b89baeea191a42c7126e4dc6420021656cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "playerctl-doc"

RDEPENDS:${PN} += ""

inherit rpm
