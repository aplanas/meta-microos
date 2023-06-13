SUMMARY = "Documentation for texlive-datetime2-usorbian"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-usorbian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn52375"

RPM_NAME = "texlive-datetime2-usorbian-doc-2023.201.1.1svn52375-52.1.noarch.rpm"
RPM_HASH = "711118b71f9e76f88b6378347b1018471afabc97f1f60a4f7f506efa1331e6fbb6a694681210b3ada968ae315729ee10dc58a27aa04d41e2f35b9c6ab602e2f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-usorbian-doc"

RDEPENDS:${PN} += ""

inherit rpm
