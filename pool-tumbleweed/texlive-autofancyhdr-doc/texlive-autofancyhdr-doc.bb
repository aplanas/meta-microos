SUMMARY = "Documentation for texlive-autofancyhdr"
DESCRIPTION = "This package includes the documentation for texlive-autofancyhdr"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn54049"

RPM_NAME = "texlive-autofancyhdr-doc-2023.209.0.0.1svn54049-54.1.noarch.rpm"
RPM_HASH = "3c436ad364be0a00ef806ec39a836e3c4e7eae280e9319b03349b30cd6d53772f6ba39d5c4d4a4f7b9456318cb7063678303191917ca469ea0ecf77a22a1340d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autofancyhdr-doc"

RDEPENDS:${PN} += ""

inherit rpm
