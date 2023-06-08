SUMMARY = "Belcard data files"
DESCRIPTION = "Belcard is a C++ library to manipulate the vCard standard format files. \
 \
This package contains data files such as belr grammar."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.16"

RPM_NAME = "belcard-data-5.2.16-1.3.noarch.rpm"
RPM_HASH = "d73211a25f7bdb69c91310c9ab8109fcae027fbcee73714e825f06330ab9c12c100d56f09fed9e5ec495957e924fa72cd2acd97c0a34908ad64e520f728e6a1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "belcard-data"
RDEPENDS:${PN} += "libbelcard1"

inherit rpm
