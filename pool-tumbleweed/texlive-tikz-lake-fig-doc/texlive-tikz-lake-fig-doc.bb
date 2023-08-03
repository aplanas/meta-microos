SUMMARY = "Documentation for texlive-tikz-lake-fig"
DESCRIPTION = "This package includes the documentation for texlive-tikz-lake-fig"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn55288"

RPM_NAME = "texlive-tikz-lake-fig-doc-2023.209.1.0svn55288-53.1.noarch.rpm"
RPM_HASH = "9460e41a2491b53ecdd15211600ac6aadc0a37c4b8ab2a9367bd26460ba7bc80f63a4d0da08ec71de751b3326702159e7193f9eaef078ef87a2bd6272e60e1fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-lake-fig-doc"

RDEPENDS:${PN} += ""

inherit rpm
