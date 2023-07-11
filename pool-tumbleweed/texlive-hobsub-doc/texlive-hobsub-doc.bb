SUMMARY = "Documentation for texlive-hobsub"
DESCRIPTION = "This package includes the documentation for texlive-hobsub"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn52810"

RPM_NAME = "texlive-hobsub-doc-2023.201.svn52810-53.2.noarch.rpm"
RPM_HASH = "99f026a7c8da0eb53ab3d4b7133d9bd85fe4116ebcb65a33ea876f6d745862ba633359084b90cb4c1246a14b1fbbe5c32ea254e4480ff38a949dc1fde46f7796"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hobsub-doc"

RDEPENDS:${PN} += ""

inherit rpm
