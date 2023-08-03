SUMMARY = "Documentation for texlive-amsaddr"
DESCRIPTION = "This package includes the documentation for texlive-amsaddr"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn64357"

RPM_NAME = "texlive-amsaddr-doc-2023.209.1.2svn64357-55.1.noarch.rpm"
RPM_HASH = "90e97c120346c4c8bab8a2364beadc51cb3bcd7b0650e1fb4d81467c6a1c4f65210239b544fe8600cba17abd8cee3a5af2567e0d2c314385516d2a1fa9c423bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-amsaddr-doc"

RDEPENDS:${PN} += ""

inherit rpm
