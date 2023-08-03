SUMMARY = "Documentation for texlive-fixmath"
DESCRIPTION = "This package includes the documentation for texlive-fixmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.1svn64648"

RPM_NAME = "texlive-fixmath-doc-2023.209.0.0.9.1svn64648-53.1.noarch.rpm"
RPM_HASH = "04c52d05e086bada1686f4a84eafec27f8f5534324d98c3571d15c74b78c67f03a89cade58dbbcab6cc80ccf978651b65da6f25d43e64fbb84b4573e0edfae05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
