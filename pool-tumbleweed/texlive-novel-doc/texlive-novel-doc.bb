SUMMARY = "Documentation for texlive-novel"
DESCRIPTION = "This package includes the documentation for texlive-novel"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.80svn65848"

RPM_NAME = "texlive-novel-doc-2023.209.1.80svn65848-55.1.noarch.rpm"
RPM_HASH = "3461b6668a2b17e40102fe7a405b41c926ece216df21fef0a8b58bf6a0f66d7becd5e70c6334ff9482e76ac22fd47a40aef3ac79c6a3358f54fb861976d8e532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-novel-doc"

RDEPENDS:${PN} += ""

inherit rpm
