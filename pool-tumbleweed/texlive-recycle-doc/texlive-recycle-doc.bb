SUMMARY = "Documentation for texlive-recycle"
DESCRIPTION = "This package includes the documentation for texlive-recycle"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-recycle-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "e49d2ede5108ce3bbbdd30d8c4ef5450f498b5e5b8ddd08ab075993e0fc6f1cee4eb9f88d5b1a3f1c0ecac1fef277dda8c7a2beb2f126f93ed562047ad080628"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-recycle-doc"

RDEPENDS:${PN} += ""

inherit rpm
