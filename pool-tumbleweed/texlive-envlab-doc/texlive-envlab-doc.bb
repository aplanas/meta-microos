SUMMARY = "Documentation for texlive-envlab"
DESCRIPTION = "This package includes the documentation for texlive-envlab"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61937"

RPM_NAME = "texlive-envlab-doc-2023.209.1.2svn61937-54.2.noarch.rpm"
RPM_HASH = "6eca37687dcfe4ace0a37c3ed0af561ffa29438b35b2ebfb1d0ecffebae32c66443c89f432f2461cad9e646eecd022fa682e1b21b76cb6b3d1d979a79ec33827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-envlab-doc"

RDEPENDS:${PN} += ""

inherit rpm
