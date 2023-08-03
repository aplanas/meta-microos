SUMMARY = "Documentation for texlive-bxjalipsum"
DESCRIPTION = "This package includes the documentation for texlive-bxjalipsum"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn66013"

RPM_NAME = "texlive-bxjalipsum-doc-2023.209.1.0svn66013-53.1.noarch.rpm"
RPM_HASH = "9029206c5934ca8905e650b156ac92966c313089465b3501707f19336094ab368d89a08512b68c2d61ddeb18da98625d32162ced6c6af4f193d172041a024530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxjalipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
