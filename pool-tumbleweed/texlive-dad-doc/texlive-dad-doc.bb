SUMMARY = "Documentation for texlive-dad"
DESCRIPTION = "This package includes the documentation for texlive-dad"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn54191"

RPM_NAME = "texlive-dad-doc-2023.209.1.2svn54191-55.1.noarch.rpm"
RPM_HASH = "eab15f26af03ac6028f3da6f70897cf7ba2526216f2a3feec677c26b27933f1c9085c9d4cf0c904af2d101522432b60f558d7b7cbb0efc255ce7f4fc72d8e15b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dad-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
