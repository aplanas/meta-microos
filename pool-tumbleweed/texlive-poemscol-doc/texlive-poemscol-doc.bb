SUMMARY = "Documentation for texlive-poemscol"
DESCRIPTION = "This package includes the documentation for texlive-poemscol"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1415926svn56082"

RPM_NAME = "texlive-poemscol-doc-2023.209.3.1415926svn56082-53.1.noarch.rpm"
RPM_HASH = "c1994be1f95f8d35613e853df21811603f2aad68a479fc14886d0ac88e94ae28564ce62ec2046f070ad794f4bdf2d28a52ed28525546995c4e5f4c882daed8fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poemscol-doc"

RDEPENDS:${PN} += ""

inherit rpm
