SUMMARY = "Binary files of cachepic"
DESCRIPTION = "Binary files of cachepic"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn15543"

RPM_NAME = "texlive-cachepic-bin-2023.20230311.svn15543-93.2.aarch64.rpm"
RPM_HASH = "5c77957c6254e4ff8c6873bb26a4273872ecb400b26f9fb73acbd0c6ed6f7268de657be5823cc35d450d672493c23a472cce46053186f7c3cf07d44cbfe79178"

RPROVIDES:${PN} += "texlive-cachepic-bin"

RDEPENDS:${PN} += "texlive-cachepic"

inherit rpm
