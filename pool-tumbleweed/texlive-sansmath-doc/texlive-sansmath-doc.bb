SUMMARY = "Documentation for texlive-sansmath"
DESCRIPTION = "This package includes the documentation for texlive-sansmath"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.1svn17997"

RPM_NAME = "texlive-sansmath-doc-2023.209.1.1svn17997-54.1.noarch.rpm"
RPM_HASH = "2398d1da7e389fdb193960f21a1e25b1d4de51ea7a99f5f02860b700d1af59901db8510954594dadc5c5de192088c5e2d13a2e144fe55f60295286e5412d98e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sansmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
