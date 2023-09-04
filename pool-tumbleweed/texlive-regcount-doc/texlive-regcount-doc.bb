SUMMARY = "Documentation for texlive-regcount"
DESCRIPTION = "This package includes the documentation for texlive-regcount"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn19979"

RPM_NAME = "texlive-regcount-doc-2023.209.1.0svn19979-54.2.noarch.rpm"
RPM_HASH = "a76233a77a222ae0b0bf49abdaf766a9eb46fb654b63f3c4575c62607de68d4a57b7fbf0df8e736abd24dfba6ed377d7715498bd4b2c68f29806725799762ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regcount-doc"

RDEPENDS:${PN} += ""

inherit rpm
