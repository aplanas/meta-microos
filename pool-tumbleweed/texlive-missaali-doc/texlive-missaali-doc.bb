SUMMARY = "Documentation for texlive-missaali"
DESCRIPTION = "This package includes the documentation for texlive-missaali"
LICENSE = "OFL-1.1"

PV = "2023.209.2.0svn61719"

RPM_NAME = "texlive-missaali-doc-2023.209.2.0svn61719-55.1.noarch.rpm"
RPM_HASH = "1d8cc111135f7c363bfca15c00205822ea725f375b85fb01608cba40d25d8611a6631d11d08786efb65293ab5c29f67bba6ea229441082ca01d4a3b648df6a81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-missaali-doc"

RDEPENDS:${PN} += ""

inherit rpm
