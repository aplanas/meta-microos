SUMMARY = "Documentation for texlive-celtic"
DESCRIPTION = "This package includes the documentation for texlive-celtic"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn39797"

RPM_NAME = "texlive-celtic-doc-2023.209.1.1svn39797-53.1.noarch.rpm"
RPM_HASH = "b457943f5510cde4820105f22dcecaeb0ea2edc0b7e9ed10cf8634a1796aad304ba491456bc970347adb09d966f7f402e2cdd9adfd9a530ba4da5060ca50fe9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-celtic-doc"

RDEPENDS:${PN} += ""

inherit rpm
