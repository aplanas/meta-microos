SUMMARY = "Documentation for texlive-context-typescripts"
DESCRIPTION = "This package includes the documentation for texlive-context-typescripts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn60422"

RPM_NAME = "texlive-context-typescripts-doc-2023.209.svn60422-55.1.noarch.rpm"
RPM_HASH = "a95895770e0094f0f5ca5e3f1a1e54c009586352fae32db6080522a3c71f56b8df35f2ca91435296ebb7d9d61a8ed247a78e0e3c5b735c10cc4451d01bcda068"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-typescripts-doc"

RDEPENDS:${PN} += ""

inherit rpm
