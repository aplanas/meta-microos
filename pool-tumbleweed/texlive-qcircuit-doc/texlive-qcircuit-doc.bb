SUMMARY = "Documentation for texlive-qcircuit"
DESCRIPTION = "This package includes the documentation for texlive-qcircuit"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.6.0svn48400"

RPM_NAME = "texlive-qcircuit-doc-2023.209.2.6.0svn48400-54.1.noarch.rpm"
RPM_HASH = "78a85f0084f52cd445d0aa722001bb5331ec3c9f74d2cf15f856bb5c1fca68d71ff106b974b6a333e984a273bf2e21462e7e38810357210c0b5f7de8e49b190e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qcircuit-doc"

RDEPENDS:${PN} += ""

inherit rpm
