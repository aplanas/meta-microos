SUMMARY = "Documentation for texlive-computational-complexity"
DESCRIPTION = "This package includes the documentation for texlive-computational-complexity"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.25fsvn44847"

RPM_NAME = "texlive-computational-complexity-doc-2023.209.2.25fsvn44847-54.1.noarch.rpm"
RPM_HASH = "1ea977917032e91616d9ef07bf9dfd3bc23cb1dec6139dedc99742e23793600dd5192b361b9ef21233332a13d2014d84ca64144f291a720ac548e13afa1c2e06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-computational-complexity-doc"

RDEPENDS:${PN} += ""

inherit rpm
