SUMMARY = "Documentation for texlive-pracjourn"
DESCRIPTION = "This package includes the documentation for texlive-pracjourn"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.4nsvn61719"

RPM_NAME = "texlive-pracjourn-doc-2023.201.0.0.4nsvn61719-52.1.noarch.rpm"
RPM_HASH = "8b14f22852059a4b3ec9b87bb3577b7c548636aefb893b83e59c7c12a0578119273c85738fc0d979a1ada84b73daf6a6888de2a8373b6db9e209fa57214d95a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pracjourn-doc"

RDEPENDS:${PN} += ""

inherit rpm
