SUMMARY = "Documentation for texlive-context-simplefonts"
DESCRIPTION = "This package includes the documentation for texlive-context-simplefonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-simplefonts-doc-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "da95b7bb77df372bf0f0157af6f25ba46f552d228457ec20cdff327d68272770344de0ea5bf4be9207d8a25157d659f4a6047de4cb5c59b296d53e1de7be0f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-simplefonts-doc"
RDEPENDS:${PN} += ""

inherit rpm
