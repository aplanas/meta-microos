SUMMARY = "Documentation for texlive-dynkin-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-dynkin-diagrams"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1415926535897932svn58758"

RPM_NAME = "texlive-dynkin-diagrams-doc-2023.209.3.1415926535897932svn58758-54.2.noarch.rpm"
RPM_HASH = "5defa9c97b4f4131faf128ee3a94b6c48054b05462b3eb7cb4585e59676115a1032063e6e824d8bbac7b7637c7c6c407e589af2b35d643aa0279e5bfd456a567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynkin-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm
