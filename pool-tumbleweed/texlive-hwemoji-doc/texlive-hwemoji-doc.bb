SUMMARY = "Documentation for texlive-hwemoji"
DESCRIPTION = "This package includes the documentation for texlive-hwemoji"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn65001"

RPM_NAME = "texlive-hwemoji-doc-2023.201.1.0svn65001-52.1.noarch.rpm"
RPM_HASH = "5b9cf1e30b8dbd833ce9c257b4b5eaff5a6756da5dfb509fb7f2893234d22b8550c10e45caaa08cf5dacc1cd7e8d5ca9a3902dd5f877e7601e9b296e9bfc02bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hwemoji-doc"

RDEPENDS:${PN} += ""

inherit rpm
