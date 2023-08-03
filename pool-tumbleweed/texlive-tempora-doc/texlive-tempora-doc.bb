SUMMARY = "Documentation for texlive-tempora"
DESCRIPTION = "This package includes the documentation for texlive-tempora"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.05svn39596"

RPM_NAME = "texlive-tempora-doc-2023.209.1.05svn39596-55.1.noarch.rpm"
RPM_HASH = "a45e495acaff31125f8976b2c25a9ceadf29f944f34a653642637c8da321ba8d7be707931ebd9504f8ebf3227abfc246c533f9d35dcc635e2ff52b15c579b3c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tempora-doc"

RDEPENDS:${PN} += ""

inherit rpm
