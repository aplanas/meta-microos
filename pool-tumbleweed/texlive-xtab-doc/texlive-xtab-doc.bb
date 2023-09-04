SUMMARY = "Documentation for texlive-xtab"
DESCRIPTION = "This package includes the documentation for texlive-xtab"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3fsvn23347"

RPM_NAME = "texlive-xtab-doc-2023.209.2.3fsvn23347-53.2.noarch.rpm"
RPM_HASH = "d3cdfea1e4ad5eb7f844609d1a3040379f0185df698544c39f4897b02e52f3422a31a1556484ebf7bd7e2a5668e8bc369cd42df92d1a7f97d883c9c0dec6c262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xtab-doc"

RDEPENDS:${PN} += ""

inherit rpm
