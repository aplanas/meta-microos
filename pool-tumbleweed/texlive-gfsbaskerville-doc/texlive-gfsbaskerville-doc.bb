SUMMARY = "Documentation for texlive-gfsbaskerville"
DESCRIPTION = "This package includes the documentation for texlive-gfsbaskerville"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn19440"

RPM_NAME = "texlive-gfsbaskerville-doc-2023.209.1.0svn19440-53.1.noarch.rpm"
RPM_HASH = "09d6a437dfa3e8e3ba50ba86b0986009b9ae37f999a3cb8a39425d5eccf82aef192142484fb245b7cb20e84cbe7be16c4d6e16c8fc45ac6c28d03eafa0bb9e92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsbaskerville-doc"

RDEPENDS:${PN} += ""

inherit rpm
