SUMMARY = "Documentation for texlive-gammas"
DESCRIPTION = "This package includes the documentation for texlive-gammas"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn56403"

RPM_NAME = "texlive-gammas-doc-2023.209.1.1svn56403-53.1.noarch.rpm"
RPM_HASH = "9307f5b67d7bf8e8367960dbd9b47509ef7e3bda0d82ebcc8600fd59ee5138c50b1b45cb25a3475f4e5cca17d713fabf53aca73fd55a2ff013447bdf1e7db559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gammas-doc"

RDEPENDS:${PN} += ""

inherit rpm
