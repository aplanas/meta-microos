SUMMARY = "Documentation for texlive-pas-tableur"
DESCRIPTION = "This package includes the documentation for texlive-pas-tableur"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01svn39542"

RPM_NAME = "texlive-pas-tableur-doc-2023.209.2.01svn39542-52.1.noarch.rpm"
RPM_HASH = "d4095ff576243c3426efc8434d1f17e3b38d882a89c49f1dc7c3ea19e2528792751c7bdea81e09baef148f0a3f0abdf636cda04bf7d758c0da4fc3dc052b8749"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pas-tableur-doc"

RDEPENDS:${PN} += ""

inherit rpm
