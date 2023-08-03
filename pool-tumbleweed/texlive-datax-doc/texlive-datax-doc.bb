SUMMARY = "Documentation for texlive-datax"
DESCRIPTION = "This package includes the documentation for texlive-datax"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn61772"

RPM_NAME = "texlive-datax-doc-2023.209.1.2.0svn61772-55.1.noarch.rpm"
RPM_HASH = "540fe0d547ce90083da848ee8df2d388fa08848e14e5f1f7712a065338b4590d8b0125bb22a0f15af1e16c0dce1aeb9ac79afd2dad0472c871ed9da30f6b3a88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datax-doc"

RDEPENDS:${PN} += ""

inherit rpm
