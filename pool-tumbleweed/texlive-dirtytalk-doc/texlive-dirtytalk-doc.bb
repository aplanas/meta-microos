SUMMARY = "Documentation for texlive-dirtytalk"
DESCRIPTION = "This package includes the documentation for texlive-dirtytalk"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.0svn20520"

RPM_NAME = "texlive-dirtytalk-doc-2023.201.1.0svn20520-52.1.noarch.rpm"
RPM_HASH = "15f957542a7339436116cc1da594c5c7197e69ec46f0c2996d7b4848d069d7c3a23e354b3fd19c08371b9dbb518aca78070b78723c77ad0b75a621ac355d724a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dirtytalk-doc"
RDEPENDS:${PN} += ""

inherit rpm
