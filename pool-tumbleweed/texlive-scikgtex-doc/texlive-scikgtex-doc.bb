SUMMARY = "Documentation for texlive-scikgtex"
DESCRIPTION = "This package includes the documentation for texlive-scikgtex"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.1svn65256"

RPM_NAME = "texlive-scikgtex-doc-2023.209.2.1.1svn65256-54.1.noarch.rpm"
RPM_HASH = "34f8d9baadddb084454a27e5a6a09e3260626152afdc06d61a4f501f131541eda6b18643ae386306cdaa9756bb474d00b23ac537595ecc6837c39ada5c2dd7fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scikgtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
