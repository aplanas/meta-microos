SUMMARY = "Documentation for texlive-yazd-thesis"
DESCRIPTION = "This package includes the documentation for texlive-yazd-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn61719"

RPM_NAME = "texlive-yazd-thesis-doc-2023.209.0.0.3svn61719-53.1.noarch.rpm"
RPM_HASH = "ec1d83d56232078bafc6b94389a62925f6d12230e716695683dbdc48f105c28ee0ce4a67b719dc51d3f18d4e678cc829ee1ae9e2761ce6bdb3a4aa79f9013468"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yazd-thesis-doc-fa \
texlive-yazd-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
