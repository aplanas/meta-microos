SUMMARY = "Documentation for texlive-unisc"
DESCRIPTION = "This package includes the documentation for texlive-unisc"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2svn63178"

RPM_NAME = "texlive-unisc-doc-2023.209.0.0.2svn63178-54.1.noarch.rpm"
RPM_HASH = "a80fbeb82497beb390d40c1127e077e3ee6142e4d5f6acad55f0cb2f8195a92d29482acf07a778e69c4470c35b78e9a3934e3845ccfac28f3a062760270fa4a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unisc-doc"

RDEPENDS:${PN} += ""

inherit rpm
