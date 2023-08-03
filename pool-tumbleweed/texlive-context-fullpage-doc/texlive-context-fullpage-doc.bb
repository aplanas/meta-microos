SUMMARY = "Documentation for texlive-context-fullpage"
DESCRIPTION = "This package includes the documentation for texlive-context-fullpage"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn47085"

RPM_NAME = "texlive-context-fullpage-doc-2023.209.svn47085-55.1.noarch.rpm"
RPM_HASH = "4e579eb5b4134d8221fafd320bcc1d02f4d78e457cafd76b57c41f135c3c842cad408d849291821734e172009cdadea2271945f49d07658cadf83fe52360c2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-fullpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
