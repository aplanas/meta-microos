SUMMARY = "Documentation for texlive-hagenberg-thesis"
DESCRIPTION = "This package includes the documentation for texlive-hagenberg-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65819"

RPM_NAME = "texlive-hagenberg-thesis-doc-2023.201.svn65819-53.2.noarch.rpm"
RPM_HASH = "f29c7abaf39a315cc384b2c5366ee91676c4db2bbdc5e1926d0786e1239dce24ef0113cbe95b48f9fcc13311a66f8fe2f05adaad189b7eecd8c065deaf88891a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hagenberg-thesis-doc-de;en \
texlive-hagenberg-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
