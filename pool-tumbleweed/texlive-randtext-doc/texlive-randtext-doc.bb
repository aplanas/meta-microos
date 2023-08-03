SUMMARY = "Documentation for texlive-randtext"
DESCRIPTION = "This package includes the documentation for texlive-randtext"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-randtext-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "5e25d8da2c8d172fb5e3f3ac0fecb70895ac33812a2b0da1dde6f099db86a9685a19b00aefcf10f4c1ad06e5b1cf633cdd6d4b7aa349c628a780e5b31702bf87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randtext-doc"

RDEPENDS:${PN} += ""

inherit rpm
