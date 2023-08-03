SUMMARY = "Documentation for texlive-charissil"
DESCRIPTION = "This package includes the documentation for texlive-charissil"
LICENSE = "OFL-1.1"

PV = "2023.209.6.101svn64998"

RPM_NAME = "texlive-charissil-doc-2023.209.6.101svn64998-54.1.noarch.rpm"
RPM_HASH = "cafd0fbf57bb532c5da6175941460f68f93561ea4d9a507f145635de74363973e36b2414a871661d150bb1918d7f525b4d088e71af279d822200cda26e047d57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-charissil-doc"

RDEPENDS:${PN} += ""

inherit rpm
