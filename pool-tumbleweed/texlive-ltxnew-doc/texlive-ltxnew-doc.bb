SUMMARY = "Documentation for texlive-ltxnew"
DESCRIPTION = "This package includes the documentation for texlive-ltxnew"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn21586"

RPM_NAME = "texlive-ltxnew-doc-2023.201.1.3svn21586-52.1.noarch.rpm"
RPM_HASH = "d5313ecdecb0a5a0b199dcf11d51e220f7c24375c8709166e5721b72f7b3f1bd0a9feab454d60c355ec11cb6164e21fd9f41040bc6e44bc2d41cdf43d843db29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxnew-doc"

RDEPENDS:${PN} += ""

inherit rpm
