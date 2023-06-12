SUMMARY = "Documentation for texlive-context-typescripts"
DESCRIPTION = "This package includes the documentation for texlive-context-typescripts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn60422"

RPM_NAME = "texlive-context-typescripts-doc-2023.204.svn60422-54.1.noarch.rpm"
RPM_HASH = "7d0e207b84eee7525c3f1eb3605bdc741c51d9819530c5b833873fce416042541b112c8d5df746b19b3d90b0f62669ceb9bcb6407fdbf8b414512737f1596a19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-typescripts-doc"
RDEPENDS:${PN} += ""

inherit rpm
