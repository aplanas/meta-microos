SUMMARY = "Documentation for texlive-abspos"
DESCRIPTION = "This package includes the documentation for texlive-abspos"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn64465"

RPM_NAME = "texlive-abspos-doc-2023.209.0.0.1svn64465-55.1.noarch.rpm"
RPM_HASH = "7d47e664bc65fb4f07f68d4beb540e503a5df2979c176393301da91367c85f967be43125f3f9556c3c6ba8c37097f874ede225277b0c92ff699ba7a3daa72e52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abspos-doc"

RDEPENDS:${PN} += ""

inherit rpm
