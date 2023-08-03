SUMMARY = "Documentation for texlive-simplebnf"
DESCRIPTION = "This package includes the documentation for texlive-simplebnf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.2svn65485"

RPM_NAME = "texlive-simplebnf-doc-2023.209.0.0.3.2svn65485-54.1.noarch.rpm"
RPM_HASH = "96b31e70c1ebc767a2f891042c84fd06d096899046304dbdc1c883d46bc11c6f44bad9914a1b124d3bd48d84b08d74bd9ba7fbb0b1565c5d651e383d1bf8688e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplebnf-doc"

RDEPENDS:${PN} += ""

inherit rpm
