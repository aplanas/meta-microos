SUMMARY = "Documentation for texlive-polytable"
DESCRIPTION = "This package includes the documentation for texlive-polytable"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.6svn55837"

RPM_NAME = "texlive-polytable-doc-2023.209.0.0.8.6svn55837-53.1.noarch.rpm"
RPM_HASH = "fd053ab3e1fce001e12e801b4de6043e47f4d87457cd2965f884bb16248b5c45db73d264d582882584b53d34e614e6f8b163561120406c61f36a38fd77f4b015"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-polytable-doc"

RDEPENDS:${PN} += ""

inherit rpm
