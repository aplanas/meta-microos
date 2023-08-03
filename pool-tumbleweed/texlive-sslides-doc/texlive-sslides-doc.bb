SUMMARY = "Documentation for texlive-sslides"
DESCRIPTION = "This package includes the documentation for texlive-sslides"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn32293"

RPM_NAME = "texlive-sslides-doc-2023.209.svn32293-58.1.noarch.rpm"
RPM_HASH = "cb9c6fbabdc88616ad0975ad3d5dd74e24df20dca160a48ffc100140a919d19381c569bb1ec1d3b37652dfa137104b714bc9e88d30a94d5722844e16e0cd070b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sslides-doc"

RDEPENDS:${PN} += ""

inherit rpm
