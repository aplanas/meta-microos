SUMMARY = "Documentation for texlive-adfathesis"
DESCRIPTION = "This package includes the documentation for texlive-adfathesis"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.2.42svn26048"

RPM_NAME = "texlive-adfathesis-doc-2023.201.2.42svn26048-54.1.noarch.rpm"
RPM_HASH = "d20cc17417f2c918f429d48642d0efa6dd0a4b6d7f385f49204f17f6149ad888b634f060ef291d4a946420d52ab2cfa822b063ce75188fcea4f866991991d691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adfathesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
