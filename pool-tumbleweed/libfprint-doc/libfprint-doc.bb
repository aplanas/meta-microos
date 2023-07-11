SUMMARY = "Development documents of libfprint"
DESCRIPTION = "This package contains the development documents for libfprint."
LICENSE = "LGPL-2.1-or-later"

PV = "1.94.5+tod1"

RPM_NAME = "libfprint-doc-1.94.5+tod1-1.4.noarch.rpm"
RPM_HASH = "6fd6e66d7f226c99355c1728237cff4b2731cf8d05baf7bd2e4be28e99d1a627791495dec7d368a782d05b565d6424bd6c7752f2a7b81e1209105c297024bd18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfprint-doc"

RDEPENDS:${PN} += ""

inherit rpm
