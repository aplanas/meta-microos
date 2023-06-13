SUMMARY = "Documentation for texlive-keyfloat"
DESCRIPTION = "This package includes the documentation for texlive-keyfloat"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.08svn65446"

RPM_NAME = "texlive-keyfloat-doc-2023.201.2.08svn65446-55.1.noarch.rpm"
RPM_HASH = "0c3d1ecf1e1e2ab9a0bf172929c6291105b6bc3f76f3ed5e5c46c0650e9b0275996e4bd759745cf64229cf0f6fa52f370afc2802e0225ea78591dbc948731c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
