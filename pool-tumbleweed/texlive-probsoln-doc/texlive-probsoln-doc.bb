SUMMARY = "Documentation for texlive-probsoln"
DESCRIPTION = "This package includes the documentation for texlive-probsoln"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.05svn44783"

RPM_NAME = "texlive-probsoln-doc-2023.201.3.05svn44783-52.1.noarch.rpm"
RPM_HASH = "811509421cb86ce2855a339b62a26ec77f08885216106dded9ee7b58a52b2f7a97a96babad59e5c6c6a760d4966e28c50dd5cf71a29fc6eee6daeff0e7e19165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-probsoln-doc"

RDEPENDS:${PN} += ""

inherit rpm
