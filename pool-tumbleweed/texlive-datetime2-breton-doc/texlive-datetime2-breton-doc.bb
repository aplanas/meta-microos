SUMMARY = "Documentation for texlive-datetime2-breton"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-breton"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn52647"

RPM_NAME = "texlive-datetime2-breton-doc-2023.209.1.2svn52647-53.1.noarch.rpm"
RPM_HASH = "2432dc78ce8fe5dddbc41bcef73b2f2df98ee66c564efb5a0de20ea863f655b2604f465f7e6dbb8b42937b77d21aca6be0911eda752b4970083abda05e6d74e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-breton-doc"

RDEPENDS:${PN} += ""

inherit rpm
