SUMMARY = "Documentation for texlive-ifallfalse"
DESCRIPTION = "This package includes the documentation for texlive-ifallfalse"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.0svn60027"

RPM_NAME = "texlive-ifallfalse-doc-2023.209.2.0.0svn60027-54.1.noarch.rpm"
RPM_HASH = "42737c7131472f2fe18561616cef3d0928b5ead6c93c666f440f03f4d6cc35091b0bbda0ff1cf2701eb8ac299bcf64acd986f8b209defcbc2645fd0fe0b6f214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifallfalse-doc"

RDEPENDS:${PN} += ""

inherit rpm
