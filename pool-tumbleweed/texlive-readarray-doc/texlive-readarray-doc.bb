SUMMARY = "Documentation for texlive-readarray"
DESCRIPTION = "This package includes the documentation for texlive-readarray"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1svn60540"

RPM_NAME = "texlive-readarray-doc-2023.201.3.1svn60540-53.2.noarch.rpm"
RPM_HASH = "50a20927ccbe657f4511efcef13b1ee58788c64ebe261891b778e6d91aa59d78b15fa8a6af620e2d5ea55dc0428e2c50639839c7c061f654ce29c3a47e7268ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-readarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
