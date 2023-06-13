SUMMARY = "Documentation for texlive-appendix"
DESCRIPTION = "This package includes the documentation for texlive-appendix"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2csvn53718"

RPM_NAME = "texlive-appendix-doc-2023.201.1.2csvn53718-54.1.noarch.rpm"
RPM_HASH = "3d673db27d0e99c50498222f308cd2ab990281779c771457dc866f2604e31e09878ae4ca4481b687b73833378eddf76fa9f473886d9392c85cb015841caeb9e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-appendix-doc"

RDEPENDS:${PN} += ""

inherit rpm
