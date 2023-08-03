SUMMARY = "Documentation for texlive-tdsfrmath"
DESCRIPTION = "This package includes the documentation for texlive-tdsfrmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-tdsfrmath-doc-2023.209.1.3svn15878-55.1.noarch.rpm"
RPM_HASH = "bfb78f72a3e41f7be1d57c32f72bf32ce851c8e313b4fd6ecb099a3e04b4082942a8f7f02707c0772fd58e17c50d0e1aa11837a47f3b5ea03e0353f5beaec8b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tdsfrmath-doc-fr;en \
texlive-tdsfrmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
