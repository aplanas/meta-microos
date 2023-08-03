SUMMARY = "Documentation for texlive-gitinfo"
DESCRIPTION = "This package includes the documentation for texlive-gitinfo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn34049"

RPM_NAME = "texlive-gitinfo-doc-2023.209.1.0svn34049-54.1.noarch.rpm"
RPM_HASH = "30750335beedcfabb4e7be4d846be977b9e2b0ae7f9268c683860a2c4f7963a0b62d2f9c85902242bb8cdde76fe0b728f934d662de62f868addb3ab1420267bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitinfo-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
