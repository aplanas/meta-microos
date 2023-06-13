SUMMARY = "Documentation for texlive-addfont"
DESCRIPTION = "This package includes the documentation for texlive-addfont"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn58559"

RPM_NAME = "texlive-addfont-doc-2023.201.1.1svn58559-54.1.noarch.rpm"
RPM_HASH = "f9a1b66de66f062db14df79eb950357ba1a3c9e5fb76979c1e94c439394372200f508808bb8679d62abd76e442feb1ae52cb6d70f3529a8056fa5f06233b3d7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-addfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
