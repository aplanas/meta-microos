SUMMARY = "Documentation for texlive-xoptarg"
DESCRIPTION = "This package includes the documentation for texlive-xoptarg"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-xoptarg-doc-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "5aa35b3fa6c7fac4ce755f2abec33e61c5c104abaabcdde5259dab48ce4b35d381dc405a835b5150a671b2b786215ef0212bb91f423f17699d1543afecfb4768"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xoptarg-doc"

RDEPENDS:${PN} += ""

inherit rpm
