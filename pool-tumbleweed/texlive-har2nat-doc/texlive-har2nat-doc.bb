SUMMARY = "Documentation for texlive-har2nat"
DESCRIPTION = "This package includes the documentation for texlive-har2nat"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-har2nat-doc-2023.209.1.0svn54080-54.2.noarch.rpm"
RPM_HASH = "ee75059509b5ae84f4ce7c596bf637324db5c6d280a67aa4989a51bd2ab62d5a486b3ce6892675efb389c7c0fcbc3c0eaf1351ad89b6126f2ac39a5051d331bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-har2nat-doc"

RDEPENDS:${PN} += ""

inherit rpm
