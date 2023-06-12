SUMMARY = "Packages for openSUSE to include in fallback repository"
DESCRIPTION = "Packages to include in fallback repository for openSUSE. The fallback repository is \
part of the installation system."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "skelcd-fallbackrepo-openSUSE-1.1-4.45.aarch64.rpm"
RPM_HASH = "aa76d0f15dceb77aa3166a73682d1a5cc3f0a6e8f6ffe2077f6936ebe257ac827cf289476c0d799590bf083f5fa80f977fb572f1fb8088eb4630842df7bb292b"

RPROVIDES:${PN} += "skelcd-fallbackrepo \
skelcd-fallbackrepo-openSUSE \
skelcd-fallbackrepo-openSUSE(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
