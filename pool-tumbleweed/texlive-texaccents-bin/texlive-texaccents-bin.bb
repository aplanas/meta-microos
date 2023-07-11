SUMMARY = "Binary files of texaccents"
DESCRIPTION = "Binary files of texaccents"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn64447"

RPM_NAME = "texlive-texaccents-bin-2023.20230311.svn64447-92.1.aarch64.rpm"
RPM_HASH = "94b96a9ca52641224231c5c0d3a603754ce5b1cf123118d9a37d69bd59462b792efd101c523d4323838cb10dfc60a76866617d50d7a96d37853eb024ed4e5ccb"

RPROVIDES:${PN} += "texlive-texaccents-bin"

RDEPENDS:${PN} += "texlive-texaccents"

inherit rpm
