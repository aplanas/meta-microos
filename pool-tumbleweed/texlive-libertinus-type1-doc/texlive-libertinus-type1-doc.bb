SUMMARY = "Documentation for texlive-libertinus-type1"
DESCRIPTION = "This package includes the documentation for texlive-libertinus-type1"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn64958"

RPM_NAME = "texlive-libertinus-type1-doc-2023.201.svn64958-54.1.noarch.rpm"
RPM_HASH = "bcd8caa21c5aeaaaf8dfb5f8e901b84867eb73a6698b7f9c2515386c0a0ac3a9675839498b24f046661a21a3b2d09fb40a3263ea144fff8ecc2698c4deafb155"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-type1-doc"
RDEPENDS:${PN} += ""

inherit rpm
