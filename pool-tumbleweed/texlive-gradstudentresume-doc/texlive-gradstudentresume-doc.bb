SUMMARY = "Documentation for texlive-gradstudentresume"
DESCRIPTION = "This package includes the documentation for texlive-gradstudentresume"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn38832"

RPM_NAME = "texlive-gradstudentresume-doc-2023.201.svn38832-53.1.noarch.rpm"
RPM_HASH = "51e9cf792f49bd80d682a14239c51353c4fc0a08e36e2fa1c9c98db9095e83db3a81ff34418ebc40f747577609457e49526cdf44a6363a910464694070ef2ede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gradstudentresume-doc"

RDEPENDS:${PN} += ""

inherit rpm
