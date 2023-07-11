SUMMARY = "Documentation for texlive-gitver"
DESCRIPTION = "This package includes the documentation for texlive-gitver"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn63920"

RPM_NAME = "texlive-gitver-doc-2023.201.1.4svn63920-53.2.noarch.rpm"
RPM_HASH = "aa12798efa1429e21415a80ffdd274361762620afd202a224bb7d02f075e0b67894b5c8ede01123501a997281221e327a997de5109b370482155b3e7cef8da38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gitver-doc"

RDEPENDS:${PN} += ""

inherit rpm
