SUMMARY = "Documentation for texlive-newtxtt"
DESCRIPTION = "This package includes the documentation for texlive-newtxtt"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.056svn54512"

RPM_NAME = "texlive-newtxtt-doc-2023.209.1.056svn54512-55.1.noarch.rpm"
RPM_HASH = "bbac3a9ab963c6686d40690f5f58797e61a2f5073c02a5724149d5345190f3c20f53754885dd3fd47a4bf5644c1fe91bbfa678b6e64fbdede85b098a0b964932"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newtxtt-doc"

RDEPENDS:${PN} += ""

inherit rpm
