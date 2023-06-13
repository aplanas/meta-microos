SUMMARY = "Documentation for texlive-junicode"
DESCRIPTION = "This package includes the documentation for texlive-junicode"
LICENSE = "OFL-1.1"

PV = "2023.201.1.0.2svn61719"

RPM_NAME = "texlive-junicode-doc-2023.201.1.0.2svn61719-55.1.noarch.rpm"
RPM_HASH = "d1378ef8d01854b531b0c42cc28e56b2ac912c6b01989b8b14c772020bec51d8b51424aacf66e0b3e6bff8e4dd1d81745cdbca9c81719a87235bb584c78e79c3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-junicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
