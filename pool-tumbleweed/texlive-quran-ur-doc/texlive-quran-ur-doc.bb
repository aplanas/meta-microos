SUMMARY = "Documentation for texlive-quran-ur"
DESCRIPTION = "This package includes the documentation for texlive-quran-ur"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.21svn57597"

RPM_NAME = "texlive-quran-ur-doc-2023.209.0.0.21svn57597-54.2.noarch.rpm"
RPM_HASH = "5b8df8e108c90f36ffb82b488a7452c4384eeb85b21dee7c45278f898b533237ea41d31c1bd509cfb06da6aa3d24b6d2912f13c284f146ccaaa3bc44ff35c339"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-ur-doc"

RDEPENDS:${PN} += ""

inherit rpm
