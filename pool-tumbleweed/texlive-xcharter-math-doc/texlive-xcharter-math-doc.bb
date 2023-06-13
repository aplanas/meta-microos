SUMMARY = "Documentation for texlive-xcharter-math"
DESCRIPTION = "This package includes the documentation for texlive-xcharter-math"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.36svn65686"

RPM_NAME = "texlive-xcharter-math-doc-2023.201.0.0.36svn65686-52.1.noarch.rpm"
RPM_HASH = "bc9c25dfef204c11ff37b158c675577186be7bfb50cdca358267cc6ded80f8a5fed93e4015e3800c2f99c9a591ec1afd3962cf51be4740c5c4607c51d267d6e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcharter-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
