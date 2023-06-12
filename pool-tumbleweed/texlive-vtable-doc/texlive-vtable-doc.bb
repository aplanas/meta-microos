SUMMARY = "Documentation for texlive-vtable"
DESCRIPTION = "This package includes the documentation for texlive-vtable"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51126"

RPM_NAME = "texlive-vtable-doc-2023.201.1.0svn51126-53.1.noarch.rpm"
RPM_HASH = "642f2a61ab2008a6c6420ed834c10b54e7bb036db3be295bcb03d6670f495c941963aa37567bc8f698b67fab2fcbcb2ddd9c489a91bb32f41744d909480e6401"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vtable-doc"
RDEPENDS:${PN} += ""

inherit rpm
