SUMMARY = "Documentation for texlive-semioneside"
DESCRIPTION = "This package includes the documentation for texlive-semioneside"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.41svn15878"

RPM_NAME = "texlive-semioneside-doc-2023.209.0.0.41svn15878-54.1.noarch.rpm"
RPM_HASH = "f0f0e514f1995bcc3ead6a767a15164998062cba05765451620038c8d21766366457c58e3b44d02bc60c1a120e2e4fbec89d4f2f2dbaf9a34353450598da9312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semioneside-doc"

RDEPENDS:${PN} += ""

inherit rpm
