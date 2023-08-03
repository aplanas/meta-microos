SUMMARY = "Documentation for texlive-randomlist"
DESCRIPTION = "This package includes the documentation for texlive-randomlist"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn45281"

RPM_NAME = "texlive-randomlist-doc-2023.209.1.3svn45281-54.1.noarch.rpm"
RPM_HASH = "44b0bf39440436b76710bfce1d45913ab1fbfe9b234d25c00be17344cdfdcebcdf56383d2afb14384b51d677ceaa0162fc5240343e51a3e8341a95f676fbeda3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randomlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
