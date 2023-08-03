SUMMARY = "Documentation for texlive-enctex"
DESCRIPTION = "This package includes the documentation for texlive-enctex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn34957"

RPM_NAME = "texlive-enctex-doc-2023.209.svn34957-54.1.noarch.rpm"
RPM_HASH = "eede57289d45c79277ce06d20059144235cd749270930a1f61512bc9cdbcd100ed026b46e9da2891b2a5c40c05b893e9441a452921efe571a7a04e8760cb91db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-enctex-doc-en;cs \
texlive-enctex-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
