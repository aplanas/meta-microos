SUMMARY = "Documentation for texlive-greektonoi"
DESCRIPTION = "This package includes the documentation for texlive-greektonoi"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.svn39419"

RPM_NAME = "texlive-greektonoi-doc-2023.201.svn39419-53.2.noarch.rpm"
RPM_HASH = "80746eef2bd94e14daf0708f144354ada4526cb72033508ab87ca373d16bc7cc6d1e5f750b25f37797d36a5d150c14efb32e4574a523943e491eb972fb9fb1ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-greektonoi-doc-el \
texlive-greektonoi-doc"

RDEPENDS:${PN} += ""

inherit rpm
