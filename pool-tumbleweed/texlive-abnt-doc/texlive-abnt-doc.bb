SUMMARY = "Documentation for texlive-abnt"
DESCRIPTION = "This package includes the documentation for texlive-abnt"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55471"

RPM_NAME = "texlive-abnt-doc-2023.209.svn55471-55.1.noarch.rpm"
RPM_HASH = "c2d9291427d0552fa3fd6d39385b5d252d5883119d0baa5831a5c8303b3df8504ba5b7e70a52d988f667b0ee1e625c7aef557b3db348ae72e37db15d6c15ddd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-abnt-doc"

RDEPENDS:${PN} += ""

inherit rpm
