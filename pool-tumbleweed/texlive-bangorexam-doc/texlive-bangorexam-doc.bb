SUMMARY = "Documentation for texlive-bangorexam"
DESCRIPTION = "This package includes the documentation for texlive-bangorexam"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.0svn65140"

RPM_NAME = "texlive-bangorexam-doc-2023.209.1.5.0svn65140-54.1.noarch.rpm"
RPM_HASH = "95926dbd2b6aa7175c5deb733cc4b5de94430de95671f0f1d073a5a202b1a8269457994c753ac357a336f1a1cc51af005c4580c0fb33477dfea5315816075a8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bangorexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
