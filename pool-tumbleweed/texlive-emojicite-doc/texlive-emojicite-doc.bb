SUMMARY = "Documentation for texlive-emojicite"
DESCRIPTION = "This package includes the documentation for texlive-emojicite"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn55131"

RPM_NAME = "texlive-emojicite-doc-2023.201.0.0.3svn55131-53.2.noarch.rpm"
RPM_HASH = "7cabf77edcc5ddf11f7effafea6077858b5dd4c2a5f4a5a4e4abcba3a466e77e0cdc755e94138e2f7d8397066adaa41256f57199c424d13a6c6181da7a6e013c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-emojicite-doc"

RDEPENDS:${PN} += ""

inherit rpm
