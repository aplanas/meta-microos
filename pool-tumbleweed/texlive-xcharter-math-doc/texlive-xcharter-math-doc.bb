SUMMARY = "Documentation for texlive-xcharter-math"
DESCRIPTION = "This package includes the documentation for texlive-xcharter-math"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.36svn65686"

RPM_NAME = "texlive-xcharter-math-doc-2023.209.0.0.36svn65686-53.2.noarch.rpm"
RPM_HASH = "579778dc772f499873c91c0012949f33a05780021118a1d7dfcbcc1e4c8bf57e042ec3b176e9acbb25622b341aa49483750fd4bed200dd652d53eb4f5dba4329"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcharter-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
