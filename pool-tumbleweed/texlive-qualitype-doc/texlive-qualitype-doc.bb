SUMMARY = "Documentation for texlive-qualitype"
DESCRIPTION = "This package includes the documentation for texlive-qualitype"
LICENSE = "OFL-1.1"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-qualitype-doc-2023.209.svn54512-54.2.noarch.rpm"
RPM_HASH = "1bf0aacc851a67187ece03a254d9f2473a8609c936b6f502e05ca97c8876b870dab9740a858ebe7ca3176bd7727a683b69fdda88d140f0e1d4905b35307c81c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qualitype-doc"

RDEPENDS:${PN} += ""

inherit rpm
