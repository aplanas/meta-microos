SUMMARY = "Documentation for texlive-newtx"
DESCRIPTION = "This package includes the documentation for texlive-newtx"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.71svn62369"

RPM_NAME = "texlive-newtx-doc-2023.209.1.71svn62369-55.1.noarch.rpm"
RPM_HASH = "f44d1b9d475cb452d7d29d789910d289a1de981609bd1869b977c85ff288d961d6f659186e3720d4999f815a9cf87c2df969f3366ae8db50adc4b4929a1f661b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newtx-doc"

RDEPENDS:${PN} += ""

inherit rpm
