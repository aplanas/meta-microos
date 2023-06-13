SUMMARY = "Documentation for texlive-fragments"
DESCRIPTION = "This package includes the documentation for texlive-fragments"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-fragments-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "0dbce3c640acf7a3d55768c994cd4a96ebd5aa8eb807845fd7419e29aef7fda89b3470b5a215130546951aaa0d668ff658753d1c2cf36435fa70d9b2762c62ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fragments-doc"

RDEPENDS:${PN} += ""

inherit rpm
