SUMMARY = "Documentation for texlive-ebgaramond-maths"
DESCRIPTION = "This package includes the documentation for texlive-ebgaramond-maths"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn52168"

RPM_NAME = "texlive-ebgaramond-maths-doc-2023.209.1.2svn52168-54.1.noarch.rpm"
RPM_HASH = "bf62cc7cd0a89a42dbe3a53da442340353dc13e539be0cd9ef58fb3a53a095f3904182a375b1002908cab0566424dc1361b4ea06bc382c08943cdd4c0791a44e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ebgaramond-maths-doc"

RDEPENDS:${PN} += ""

inherit rpm
