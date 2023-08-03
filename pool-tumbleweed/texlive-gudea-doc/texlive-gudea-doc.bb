SUMMARY = "Documentation for texlive-gudea"
DESCRIPTION = "This package includes the documentation for texlive-gudea"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.0.1svn57359"

RPM_NAME = "texlive-gudea-doc-2023.209.0.0.0.1svn57359-54.1.noarch.rpm"
RPM_HASH = "f9dce35153ea304ef4fb7d3881c1989d5917d26b2ac3c2a78a0fbe391c8b37818dc6cdee6b9ec34a3824473fc74a74efba9c5a12313af722d16c64e6fd813a08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gudea-doc"

RDEPENDS:${PN} += ""

inherit rpm
