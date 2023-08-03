SUMMARY = "Documentation for texlive-pdfoverlay"
DESCRIPTION = "This package includes the documentation for texlive-pdfoverlay"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn64210"

RPM_NAME = "texlive-pdfoverlay-doc-2023.209.1.3svn64210-52.1.noarch.rpm"
RPM_HASH = "f25aa0c49a0aceaf5d24e6cb37de15ddb7b3d3f18142c1671f1ea47dc123b1ba8d9abbbc394bc022a2055aa7592ed532803aac35337b2ef4cd2e7a95b37c3dfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfoverlay-doc"

RDEPENDS:${PN} += ""

inherit rpm
