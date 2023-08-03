SUMMARY = "Documentation for texlive-pfarrei"
DESCRIPTION = "This package includes the documentation for texlive-pfarrei"
LICENSE = "LPPL-1.0"

PV = "2023.209.r36svn31934"

RPM_NAME = "texlive-pfarrei-doc-2023.209.r36svn31934-52.1.noarch.rpm"
RPM_HASH = "a8449909f99fa240c9f74397d7e207a69a9a45e7e89138fb56faebcc765e2e9020deaea3129b86bb958101d7d723d126391f886051e9c89a51444ff570b82b7d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pfarrei-doc-de \
texlive-pfarrei-doc"

RDEPENDS:${PN} += ""

inherit rpm
