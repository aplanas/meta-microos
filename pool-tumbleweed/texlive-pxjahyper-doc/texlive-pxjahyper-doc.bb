SUMMARY = "Documentation for texlive-pxjahyper"
DESCRIPTION = "This package includes the documentation for texlive-pxjahyper"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn66272"

RPM_NAME = "texlive-pxjahyper-doc-2023.201.1.3svn66272-53.2.noarch.rpm"
RPM_HASH = "6d427979d742a5c0f7b94580b3887983d5d71d81de2cd56f5da586f2bc0c736c6576a8d2f440ccb8bb8d3eeee5caa5cc43a4b2193336ffeb3f7115471b820827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxjahyper-doc-ja \
texlive-pxjahyper-doc"

RDEPENDS:${PN} += ""

inherit rpm
