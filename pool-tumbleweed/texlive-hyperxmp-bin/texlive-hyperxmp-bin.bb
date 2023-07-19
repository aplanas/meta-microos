SUMMARY = "Binary files of hyperxmp"
DESCRIPTION = "Binary files of hyperxmp"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn56984"

RPM_NAME = "texlive-hyperxmp-bin-2023.20230311.svn56984-93.1.aarch64.rpm"
RPM_HASH = "526b3b96929e9ddad749baf591ab98bc2ad553afca57f2b9e1b3e9c3cf0562d3df307060ee9bf5f5c44742da3714e30d697e0be26bc8ffbda3ccda95629a3966"

RPROVIDES:${PN} += "texlive-hyperxmp-bin"

RDEPENDS:${PN} += "texlive-hyperxmp"

inherit rpm
