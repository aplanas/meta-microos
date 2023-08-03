SUMMARY = "Documentation for texlive-babel-norsk"
DESCRIPTION = "This package includes the documentation for texlive-babel-norsk"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0isvn65093"

RPM_NAME = "texlive-babel-norsk-doc-2023.209.2.0isvn65093-54.1.noarch.rpm"
RPM_HASH = "3ed0e1c6b36451f781c0d5acf34f06ddea6902e45d2e4c081d236b22bc70ec6951f127a459a6573e3a12ed9e668cfb1463eb73fa441b21b9264ea1f685ed90f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-norsk-doc"

RDEPENDS:${PN} += ""

inherit rpm
