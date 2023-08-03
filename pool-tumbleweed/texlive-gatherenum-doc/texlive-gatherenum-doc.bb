SUMMARY = "Documentation for texlive-gatherenum"
DESCRIPTION = "This package includes the documentation for texlive-gatherenum"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.8svn52209"

RPM_NAME = "texlive-gatherenum-doc-2023.209.1.8svn52209-53.1.noarch.rpm"
RPM_HASH = "ef29c9b059251dce9ac9b7fd7650a435c34b262d51023b26cbd3898c7ad13f9dc9cb7d752ece27573de8298501b615b8b71b8d731950653daf74a9287fd88194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gatherenum-doc"

RDEPENDS:${PN} += ""

inherit rpm
