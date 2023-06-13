SUMMARY = "Documentation for texlive-bxjatoucs"
DESCRIPTION = "This package includes the documentation for texlive-bxjatoucs"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn52509"

RPM_NAME = "texlive-bxjatoucs-doc-2023.201.0.0.2svn52509-52.1.noarch.rpm"
RPM_HASH = "fffeb063576731fffbf1c6f721986debcc117706e00169ef39f8bf67d152e945ca02708f54e19c7c3ad18f8b9f3ef355a44e1eb310010632a31ab2b3cce51698"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxjatoucs-doc"

RDEPENDS:${PN} += ""

inherit rpm
