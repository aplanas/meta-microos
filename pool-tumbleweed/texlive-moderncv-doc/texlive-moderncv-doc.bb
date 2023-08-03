SUMMARY = "Documentation for texlive-moderncv"
DESCRIPTION = "This package includes the documentation for texlive-moderncv"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3.1svn62128"

RPM_NAME = "texlive-moderncv-doc-2023.209.2.3.1svn62128-55.1.noarch.rpm"
RPM_HASH = "ea4f21f404c5d8d8544e8c2aef459b8d8c9735aa30f965979363b8068c53d0050a5a3f6fe4a78e172f510c48410055e6a335d8036c4f746e3a6d2defd0a20342"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moderncv-doc"

RDEPENDS:${PN} += ""

inherit rpm
