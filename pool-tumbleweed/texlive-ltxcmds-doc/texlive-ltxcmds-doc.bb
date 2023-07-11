SUMMARY = "Documentation for texlive-ltxcmds"
DESCRIPTION = "This package includes the documentation for texlive-ltxcmds"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.25svn56421"

RPM_NAME = "texlive-ltxcmds-doc-2023.208.1.25svn56421-53.1.noarch.rpm"
RPM_HASH = "53d6b55102dbc9188a3144b3384aba1ae1b603e24cc41c6e6182c37f59abbc4f49c9428f73699e28ae3f93ccf4d66f753f9fbdb18bf0e2aba04b91180a1e820f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxcmds-doc"

RDEPENDS:${PN} += ""

inherit rpm
