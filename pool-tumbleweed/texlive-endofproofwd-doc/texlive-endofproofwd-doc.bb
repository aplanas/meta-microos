SUMMARY = "Documentation for texlive-endofproofwd"
DESCRIPTION = "This package includes the documentation for texlive-endofproofwd"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55643"

RPM_NAME = "texlive-endofproofwd-doc-2023.201.svn55643-53.2.noarch.rpm"
RPM_HASH = "9f011eefd6d40ac1c2d6b153b9b0cfe6f2ea10819aa756331e35dfb45a1e82962d6593bfb7a1dd0932f4d9130e4e6b895ca7a229be026898f7d4e5e6c12d4191"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endofproofwd-doc"

RDEPENDS:${PN} += ""

inherit rpm
