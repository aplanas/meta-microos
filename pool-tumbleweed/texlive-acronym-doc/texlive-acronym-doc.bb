SUMMARY = "Documentation for texlive-acronym"
DESCRIPTION = "This package includes the documentation for texlive-acronym"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.47svn54758"

RPM_NAME = "texlive-acronym-doc-2023.209.1.47svn54758-55.1.noarch.rpm"
RPM_HASH = "982814b528dbf608ab86908a3714d19edd876a83b478adbab4cfd095464db4fcab5541ef683273747e14722d20170581dea24e60ffda3ae6589dfec3e4b0ac0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-acronym-doc"

RDEPENDS:${PN} += ""

inherit rpm
