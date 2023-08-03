SUMMARY = "Documentation for texlive-logreq"
DESCRIPTION = "This package includes the documentation for texlive-logreq"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn53003"

RPM_NAME = "texlive-logreq-doc-2023.209.1.0svn53003-55.1.noarch.rpm"
RPM_HASH = "3be23ff7a4776d820569debdedaa1e0aa8b58a5561aa01555462f4591ce251e256c785625debe212c2c1216718118036459674ac3650cb748c69897d72f786c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-logreq-doc"

RDEPENDS:${PN} += ""

inherit rpm
