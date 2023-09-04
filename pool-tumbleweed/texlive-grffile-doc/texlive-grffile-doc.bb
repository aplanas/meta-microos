SUMMARY = "Documentation for texlive-grffile"
DESCRIPTION = "This package includes the documentation for texlive-grffile"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn52756"

RPM_NAME = "texlive-grffile-doc-2023.209.2.1svn52756-54.2.noarch.rpm"
RPM_HASH = "adebed8039e1cbc23dcb5d436061c584baea8bdffc7505eb44b654e7b3aa43550bfaeb09789af9ad4160860b972fd0b37997ac9554e1e3e09f9d50e461343621"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grffile-doc"

RDEPENDS:${PN} += ""

inherit rpm
