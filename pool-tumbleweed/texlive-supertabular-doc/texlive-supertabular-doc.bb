SUMMARY = "Documentation for texlive-supertabular"
DESCRIPTION = "This package includes the documentation for texlive-supertabular"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.1gsvn53658"

RPM_NAME = "texlive-supertabular-doc-2023.201.4.1gsvn53658-57.1.noarch.rpm"
RPM_HASH = "5f80125ee99f0f35796e12ab49087d780d87a929b98496937fac36cf093dea193b60027cc4cba58d709d8588e1e8f2b853b9a32481bb7b6838515b3a6f687c6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-supertabular-doc"

RDEPENDS:${PN} += ""

inherit rpm
