SUMMARY = "Documentation for texlive-gauss"
DESCRIPTION = "This package includes the documentation for texlive-gauss"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn32934"

RPM_NAME = "texlive-gauss-doc-2023.209.svn32934-53.1.noarch.rpm"
RPM_HASH = "b0a0d20750f1f7b21345445a5f9a2ee5ac6de5fd4647f0f286d55182e56c3c0511d5b718706b39f52d98bfea107f9381763caf2e30d9ae9bf22c5369f494c2ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gauss-doc"

RDEPENDS:${PN} += ""

inherit rpm
