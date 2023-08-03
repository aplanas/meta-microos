SUMMARY = "Documentation for texlive-esstix"
DESCRIPTION = "This package includes the documentation for texlive-esstix"
LICENSE = "OFL-1.1"

PV = "2023.209.1.0svn22426"

RPM_NAME = "texlive-esstix-doc-2023.209.1.0svn22426-53.1.noarch.rpm"
RPM_HASH = "0967cfbca59f5fbbd585353655cb17b184af5fd91f103ef5e029babd9fc2336f2cd37723bd6b50c3db632598eb428a4e8860cf6c768fa0f0e8128c5516016853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esstix-doc"

RDEPENDS:${PN} += ""

inherit rpm
