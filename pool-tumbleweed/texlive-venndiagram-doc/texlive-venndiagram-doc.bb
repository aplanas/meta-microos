SUMMARY = "Documentation for texlive-venndiagram"
DESCRIPTION = "This package includes the documentation for texlive-venndiagram"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn47952"

RPM_NAME = "texlive-venndiagram-doc-2023.209.1.2svn47952-54.1.noarch.rpm"
RPM_HASH = "be262b2218842d6c4611f7c44c65e8e9cf5d5fcd40515f33b5d16250f7b0de4c546d2431e14b8ae39ae64563a05c68d11c9c6e631e2e1d3b9f8e8b6f539bb44e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-venndiagram-doc"

RDEPENDS:${PN} += ""

inherit rpm
