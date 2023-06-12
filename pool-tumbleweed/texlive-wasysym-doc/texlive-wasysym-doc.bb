SUMMARY = "Documentation for texlive-wasysym"
DESCRIPTION = "This package includes the documentation for texlive-wasysym"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn54080"

RPM_NAME = "texlive-wasysym-doc-2023.201.2.4svn54080-53.1.noarch.rpm"
RPM_HASH = "9b920a514ae316e0cff0f6f73900d57ce0d16d293afc80b342ec028a0a18a6f2b671cc9c0c5f772b10650a689bb8a0f069696795d8f3a71db81cad3a01988841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wasysym-doc"
RDEPENDS:${PN} += ""

inherit rpm
