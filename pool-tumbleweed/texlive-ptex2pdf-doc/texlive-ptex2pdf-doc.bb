SUMMARY = "Documentation for texlive-ptex2pdf"
DESCRIPTION = "This package includes the documentation for texlive-ptex2pdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.20200520.0svn65953"

RPM_NAME = "texlive-ptex2pdf-doc-2023.209.20200520.0svn65953-54.2.noarch.rpm"
RPM_HASH = "46e059f9b694c4fe2b159385e8c0aef5ddf7066c43b39aee85a2c7465cfbb3563db1ba40308fa82f0102d438f852c3ff534d8898811bddc7981fb612abd928f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex2pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
