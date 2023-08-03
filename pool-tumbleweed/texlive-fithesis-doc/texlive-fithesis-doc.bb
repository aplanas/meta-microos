SUMMARY = "Documentation for texlive-fithesis"
DESCRIPTION = "This package includes the documentation for texlive-fithesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn64135"

RPM_NAME = "texlive-fithesis-doc-2023.209.1.1.0svn64135-53.1.noarch.rpm"
RPM_HASH = "6b90b559fbeebd01560ea1a2339a9d23e39ae0795ef2a1f78133f076d4860180eab277e6f87141aa09cb82b71f5a6675af31849293a0033aaa3d56740453508e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
