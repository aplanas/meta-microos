SUMMARY = "Documentation for texlive-koma-script"
DESCRIPTION = "This package includes the documentation for texlive-koma-script"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.38svn64685"

RPM_NAME = "texlive-koma-script-doc-2023.209.3.38svn64685-56.1.noarch.rpm"
RPM_HASH = "248578a2346d92026372b62aec78d15a62357fc9c603c86320a9ee49d2a82c0c3352ee5c9d9218f1e201ad927b0d30f04d61d084c476c8649711b0a0200f874b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-koma-script-doc"

RDEPENDS:${PN} += ""

inherit rpm
