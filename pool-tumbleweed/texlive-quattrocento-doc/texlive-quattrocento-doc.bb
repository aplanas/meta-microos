SUMMARY = "Documentation for texlive-quattrocento"
DESCRIPTION = "This package includes the documentation for texlive-quattrocento"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64372"

RPM_NAME = "texlive-quattrocento-doc-2023.201.svn64372-53.1.noarch.rpm"
RPM_HASH = "debb6771e18620224b6f6914f3dfec6971e00cc22edc112ae202ff3b739d9be226530950996e1788d5b05d16ef125b0aa095bbbeac00b463eddd74e2294f2d7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quattrocento-doc"

RDEPENDS:${PN} += ""

inherit rpm
