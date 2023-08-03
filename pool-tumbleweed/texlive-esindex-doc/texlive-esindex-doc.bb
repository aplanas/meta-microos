SUMMARY = "Documentation for texlive-esindex"
DESCRIPTION = "This package includes the documentation for texlive-esindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn52342"

RPM_NAME = "texlive-esindex-doc-2023.209.1.7svn52342-54.1.noarch.rpm"
RPM_HASH = "b69352d361431abeff3501193dd577791c35484ffde9711bb8e8f9633fabe1d8299f4f3f42f14f51301cfd0042f13e70f8070a45d5f15b9a9928b475fbecdc40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
