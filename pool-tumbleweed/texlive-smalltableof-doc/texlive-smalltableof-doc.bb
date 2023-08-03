SUMMARY = "Documentation for texlive-smalltableof"
DESCRIPTION = "This package includes the documentation for texlive-smalltableof"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20333"

RPM_NAME = "texlive-smalltableof-doc-2023.209.svn20333-58.1.noarch.rpm"
RPM_HASH = "9ca379fa845e0d92b323ed62dd1abbbfe630327bf7b149f46f2e375f25c378d861fd975ca6d8791d033fd5992edd1d30abc37e051d2d87e4303c0f05af68dd96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-smalltableof-doc-fr \
texlive-smalltableof-doc"

RDEPENDS:${PN} += ""

inherit rpm
