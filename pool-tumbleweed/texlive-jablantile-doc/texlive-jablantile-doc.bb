SUMMARY = "Documentation for texlive-jablantile"
DESCRIPTION = "This package includes the documentation for texlive-jablantile"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn16364"

RPM_NAME = "texlive-jablantile-doc-2023.209.svn16364-56.1.noarch.rpm"
RPM_HASH = "b312978ce5e5c75b18fa25fa5fe2f75ae52a7e5641e2fdacb6598fc74bb0de1b4d4eed257e09da37747311b4dc7f36e56d1b1d3b7ad56c96bae6dede250136fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jablantile-doc"

RDEPENDS:${PN} += ""

inherit rpm
