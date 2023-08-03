SUMMARY = "Documentation for texlive-xunicode"
DESCRIPTION = "This package includes the documentation for texlive-xunicode"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.981svn30466"

RPM_NAME = "texlive-xunicode-doc-2023.209.0.0.981svn30466-53.1.noarch.rpm"
RPM_HASH = "17114ee459cd61f7271d822148f8cb48a15462bcc10acca4cee772b980a3a43d7bd5fbd4673298e8fb6620c983be596d9720db1a3a938f3f183d6123aa0d7f30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xunicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
