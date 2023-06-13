SUMMARY = "Documentation for texlive-thinsp"
DESCRIPTION = "This package includes the documentation for texlive-thinsp"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2svn39669"

RPM_NAME = "texlive-thinsp-doc-2023.201.0.0.2svn39669-54.1.noarch.rpm"
RPM_HASH = "fb95b7ef3ca106de5558d28d97a87ee66336dee3a551222dcae929aee7dec33aa3dec7d7026095f010099c101be23600c5b8cb0a1beac3c000d4ef05289110fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thinsp-doc"

RDEPENDS:${PN} += ""

inherit rpm
