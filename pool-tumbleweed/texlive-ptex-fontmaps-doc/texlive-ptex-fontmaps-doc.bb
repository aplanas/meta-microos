SUMMARY = "Documentation for texlive-ptex-fontmaps"
DESCRIPTION = "This package includes the documentation for texlive-ptex-fontmaps"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.20210625.0svn65953"

RPM_NAME = "texlive-ptex-fontmaps-doc-2023.209.20210625.0svn65953-54.1.noarch.rpm"
RPM_HASH = "9277cca54d4d807b4d6558722a683b9df1e016fdb51a7e19002585f177496011b6d195ac612472f525a076f5aeb1b8c9ba746640605ea78c63fd70b0494f600e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-fontmaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
