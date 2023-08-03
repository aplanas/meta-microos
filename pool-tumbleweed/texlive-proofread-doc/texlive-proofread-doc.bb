SUMMARY = "Documentation for texlive-proofread"
DESCRIPTION = "This package includes the documentation for texlive-proofread"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.04svn61719"

RPM_NAME = "texlive-proofread-doc-2023.209.1.04svn61719-53.1.noarch.rpm"
RPM_HASH = "9b928fd7a2997e0010986349927cfd93c50f739816e794df543a8d619a66f7c44993a9287fa462b4775b9d0dbdd3c91ad79061ebc8fbc88667b25adb694baac1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-proofread-doc"

RDEPENDS:${PN} += ""

inherit rpm
