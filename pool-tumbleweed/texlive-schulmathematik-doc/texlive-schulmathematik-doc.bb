SUMMARY = "Documentation for texlive-schulmathematik"
DESCRIPTION = "This package includes the documentation for texlive-schulmathematik"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn64108"

RPM_NAME = "texlive-schulmathematik-doc-2023.209.1.3svn64108-54.1.noarch.rpm"
RPM_HASH = "76742ac0e200cd5746ccc0ded42f4c5842604e9788e0bf05de43c20287a57af39eca45df72f444bfb2becb098933ab3c839861520310334640741495dced648b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schulmathematik-doc"

RDEPENDS:${PN} += ""

inherit rpm
