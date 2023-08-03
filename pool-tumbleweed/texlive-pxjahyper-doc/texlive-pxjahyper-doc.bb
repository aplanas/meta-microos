SUMMARY = "Documentation for texlive-pxjahyper"
DESCRIPTION = "This package includes the documentation for texlive-pxjahyper"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn66272"

RPM_NAME = "texlive-pxjahyper-doc-2023.209.1.3svn66272-54.1.noarch.rpm"
RPM_HASH = "4b1ef0423df3ce3919594c40d732393d8643527e616023bd67195ec3b72f4e3ba4bf574794a6d8b5bc491b48a774bf2fb9bd3287ba49af77e3ca95dfac3896c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxjahyper-doc-ja \
texlive-pxjahyper-doc"

RDEPENDS:${PN} += ""

inherit rpm
