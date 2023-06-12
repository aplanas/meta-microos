SUMMARY = "Documentation for texlive-rcs"
DESCRIPTION = "This package includes the documentation for texlive-rcs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-rcs-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "5bd4c4e2038c4dac5fa5b5f33bbb864c81cd59790ad063f8a6059fc9d33a8f5d575cb9ba0789c42da9767100510ac57be0485c376119dec823a9b1a2c46e9ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcs-doc"
RDEPENDS:${PN} += ""

inherit rpm
