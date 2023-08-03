SUMMARY = "Documentation for texlive-lambda-lists"
DESCRIPTION = "This package includes the documentation for texlive-lambda-lists"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn31402"

RPM_NAME = "texlive-lambda-lists-doc-2023.209.svn31402-56.1.noarch.rpm"
RPM_HASH = "cd88645c7a6c59b2f7b2794485154369e960410a4bfbe817cf87a31f624426c96afee8c1f6f141a7c1a9f53752cb73bdf22fa7976bc446995ccdabf83efc17d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lambda-lists-doc"

RDEPENDS:${PN} += ""

inherit rpm
