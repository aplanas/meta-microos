SUMMARY = "Binary files of dtxgen"
DESCRIPTION = "Binary files of dtxgen"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29031"

RPM_NAME = "texlive-dtxgen-bin-2023.20230311.svn29031-93.2.aarch64.rpm"
RPM_HASH = "e5d2057d8452bf2c96ae3cc7f8f16fab6ab983632c4ce9fac9cfe3d3f7cd4ed50bf7fd0515157d6bb032d97853efc4e67c3b4c0502d09e4edc4b865c006e21dc"

RPROVIDES:${PN} += "texlive-dtxgen-bin"

RDEPENDS:${PN} += "texlive-dtxgen"

inherit rpm
