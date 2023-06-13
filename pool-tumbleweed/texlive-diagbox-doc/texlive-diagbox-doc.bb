SUMMARY = "Documentation for texlive-diagbox"
DESCRIPTION = "This package includes the documentation for texlive-diagbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.4svn54080"

RPM_NAME = "texlive-diagbox-doc-2023.201.2.4svn54080-52.1.noarch.rpm"
RPM_HASH = "f13ad90f2337f712e1769cca8961ab43b68e3f33cc2012f60e066b2de47cf736bfbb1c57b0e14cf43419e826186f5ff3260304d64bede9829718b0922468a973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diagbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
