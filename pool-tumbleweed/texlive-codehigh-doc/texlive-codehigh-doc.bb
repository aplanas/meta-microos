SUMMARY = "Documentation for texlive-codehigh"
DESCRIPTION = "This package includes the documentation for texlive-codehigh"
LICENSE = "LPPL-1.0"

PV = "2023.209.2023asvn65787"

RPM_NAME = "texlive-codehigh-doc-2023.209.2023asvn65787-54.1.noarch.rpm"
RPM_HASH = "9c5c50e91c2b4757e3d2cf90427045106c163958a3cf30acf8d5b455b46421c14a6ccac7d7864f71732257f542dfcd3fe94bd5a5be73302d54d9aae09547aa81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-codehigh-doc"

RDEPENDS:${PN} += ""

inherit rpm
