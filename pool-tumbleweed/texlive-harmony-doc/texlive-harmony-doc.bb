SUMMARY = "Documentation for texlive-harmony"
DESCRIPTION = "This package includes the documentation for texlive-harmony"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-harmony-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "25cb7f3769b41b24042e45612a6df44e3806da69ea735240d077e0db1720652f1975c8a234d888eff1212c14dfd30482125a98e3dc99ac839b4028051b8d1123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-harmony-doc"

RDEPENDS:${PN} += ""

inherit rpm
