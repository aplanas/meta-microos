SUMMARY = "Documentation for texlive-tkz-orm"
DESCRIPTION = "This package includes the documentation for texlive-tkz-orm"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1.4svn61719"

RPM_NAME = "texlive-tkz-orm-doc-2023.209.0.0.1.4svn61719-53.1.noarch.rpm"
RPM_HASH = "ecfc7bf454f5debead9b863c465e092b2d4eafce723cd1fef906849d9004e375e3117968fe23247fce006c7ab230d689a45ba773d750110773d34ac0c61954e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tkz-orm-doc"

RDEPENDS:${PN} += ""

inherit rpm
