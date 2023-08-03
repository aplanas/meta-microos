SUMMARY = "Documentation for texlive-url"
DESCRIPTION = "This package includes the documentation for texlive-url"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn32528"

RPM_NAME = "texlive-url-doc-2023.209.3.4svn32528-54.1.noarch.rpm"
RPM_HASH = "2abbbdf6a2d784f3fa645c6d76bd8f9336c3ba1677fee2b86ddb94996af66b30370d78ab81bdbecc2d94cca2bc85e38c0e7d54da360121c33ca4d06ea3fadd4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-url-doc"

RDEPENDS:${PN} += ""

inherit rpm
