SUMMARY = "Documentation for texlive-sauerj"
DESCRIPTION = "This package includes the documentation for texlive-sauerj"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-sauerj-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "d10ae840b1fafd72a8a8d250590a35c31138880e1b89369c62ae3faff6475d1e1c7f5eaa7d1dbf06ac6dd1f64ed1435bb09d69531830c725c1aa582f50f8fce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sauerj-doc"

RDEPENDS:${PN} += ""

inherit rpm
