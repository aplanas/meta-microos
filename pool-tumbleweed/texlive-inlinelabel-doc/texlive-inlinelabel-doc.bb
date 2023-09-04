SUMMARY = "Documentation for texlive-inlinelabel"
DESCRIPTION = "This package includes the documentation for texlive-inlinelabel"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.1svn63853"

RPM_NAME = "texlive-inlinelabel-doc-2023.209.1.2.1svn63853-54.1.noarch.rpm"
RPM_HASH = "372afa7d22244595c26f53fb56d829102702a3b9ce03fd48bdcd14d0548b6b7db136498a308aa0d498b6bc3eac95ac2098b63920c591c57515838108ccbe2722"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inlinelabel-doc"

RDEPENDS:${PN} += ""

inherit rpm
