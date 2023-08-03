SUMMARY = "Documentation for texlive-oldstyle"
DESCRIPTION = "This package includes the documentation for texlive-oldstyle"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-oldstyle-doc-2023.209.0.0.2svn15878-55.1.noarch.rpm"
RPM_HASH = "d2909179cc81599a042cea62fbddcd2124cd13413a75311e5034be211292fd4aa533479fefa64bc64f4b8d4e85a7559b3b3ea69370f2791edd9e5c8fab31b3ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oldstyle-doc"

RDEPENDS:${PN} += ""

inherit rpm
