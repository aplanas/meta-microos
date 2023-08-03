SUMMARY = "Documentation for texlive-latex-fonts"
DESCRIPTION = "This package includes the documentation for texlive-latex-fonts"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28888"

RPM_NAME = "texlive-latex-fonts-doc-2023.209.svn28888-56.1.noarch.rpm"
RPM_HASH = "99b28ea0affeb7bcd6ee1f1dc24d652273d46ef9660e0c1d938513d09c9deecfc91164e6846a4de1fd87754c71ab4489cb8b032381d739ea871716ca69d12621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-fonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
