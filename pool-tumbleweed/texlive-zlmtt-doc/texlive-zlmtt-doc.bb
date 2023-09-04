SUMMARY = "Documentation for texlive-zlmtt"
DESCRIPTION = "This package includes the documentation for texlive-zlmtt"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.032svn64076"

RPM_NAME = "texlive-zlmtt-doc-2023.209.1.032svn64076-53.2.noarch.rpm"
RPM_HASH = "e241d0793ed8d0741513397882c548914c479d31cb3a68d4699d7e919d736985383f0ea052e031a0f0ebb6a0f56975b2da8da3ab49028666580560d2863d9539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zlmtt-doc"

RDEPENDS:${PN} += ""

inherit rpm
