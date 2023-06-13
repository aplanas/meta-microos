SUMMARY = "Documentation for texlive-calctab"
DESCRIPTION = "This package includes the documentation for texlive-calctab"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6.1svn15878"

RPM_NAME = "texlive-calctab-doc-2023.201.0.0.6.1svn15878-52.1.noarch.rpm"
RPM_HASH = "c69426b2006c97e3faa440c346cddc65f47dba7d88322e83f18fabbe02ba8b8ab428dcef22958bd8ac9a8f1b09278681f56695e4cf45013fd4d44ca5a1dde958"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calctab-doc"

RDEPENDS:${PN} += ""

inherit rpm
