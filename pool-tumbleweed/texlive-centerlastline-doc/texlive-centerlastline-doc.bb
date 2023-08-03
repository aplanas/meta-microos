SUMMARY = "Documentation for texlive-centerlastline"
DESCRIPTION = "This package includes the documentation for texlive-centerlastline"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn56644"

RPM_NAME = "texlive-centerlastline-doc-2023.209.1.0svn56644-53.1.noarch.rpm"
RPM_HASH = "7aab6a4a346a97464554faddfbbbdf3805c4f2e7af9291c8cd7ca7fdfbe516aaa2088e358c21d25fcc4074bb439cfab976c6ba6fac6eabc87a4debb10d594e41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-centerlastline-doc"

RDEPENDS:${PN} += ""

inherit rpm
