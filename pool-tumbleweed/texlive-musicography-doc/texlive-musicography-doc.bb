SUMMARY = "Documentation for texlive-musicography"
DESCRIPTION = "This package includes the documentation for texlive-musicography"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66115"

RPM_NAME = "texlive-musicography-doc-2023.209.svn66115-55.1.noarch.rpm"
RPM_HASH = "8fe64db8aa85ad40efdf21624a8bfb8593f4d9cd68b86780e2fcbfb42e89bf7af8c256cd6f512d3f6fe7d1e50f93ff588188d05128f2df3c3f5c08968666ee59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-musicography-doc"

RDEPENDS:${PN} += ""

inherit rpm
