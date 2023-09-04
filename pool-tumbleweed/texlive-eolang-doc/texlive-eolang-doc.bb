SUMMARY = "Documentation for texlive-eolang"
DESCRIPTION = "This package includes the documentation for texlive-eolang"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12.1svn66274"

RPM_NAME = "texlive-eolang-doc-2023.209.0.0.12.1svn66274-54.2.noarch.rpm"
RPM_HASH = "3de5e70bfd6426ad186cfeffe0a07b58e0d3f70e4cdcd8b7a2bea450535cf4116218a49092a35ccd8b847b6f35d4354ebc9b11169fec07caeb085b9053546dd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eolang-doc"

RDEPENDS:${PN} += ""

inherit rpm
