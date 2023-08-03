SUMMARY = "Documentation for texlive-algolrevived"
DESCRIPTION = "This package includes the documentation for texlive-algolrevived"
LICENSE = "OFL-1.1"

PV = "2023.209.1.052svn56864"

RPM_NAME = "texlive-algolrevived-doc-2023.209.1.052svn56864-55.1.noarch.rpm"
RPM_HASH = "981b2df5cae137205606848e7f2ccaf22dc5305c13838b98d51c9bc15ee115c846a1f1b839261ca1089ff52d8d61832ab46ca0054e430447b597888d00a938e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-algolrevived-doc"

RDEPENDS:${PN} += ""

inherit rpm
