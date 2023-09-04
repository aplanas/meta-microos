SUMMARY = "Documentation for texlive-raleway"
DESCRIPTION = "This package includes the documentation for texlive-raleway"
LICENSE = "OFL-1.1"

PV = "2023.209.1.4svn42629"

RPM_NAME = "texlive-raleway-doc-2023.209.1.4svn42629-54.2.noarch.rpm"
RPM_HASH = "45050f6df2d8cef0be3bafedd1862bc894495d6187f537cbc281afd3f933c25dd04c60276937e83dbbfb9aabfa785f6ddcfc36ba3911d1ba63d0a96944044e36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-raleway-doc"

RDEPENDS:${PN} += ""

inherit rpm
