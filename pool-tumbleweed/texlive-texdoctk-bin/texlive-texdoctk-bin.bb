SUMMARY = "Binary files of texdoctk"
DESCRIPTION = "Binary files of texdoctk"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn29741"

RPM_NAME = "texlive-texdoctk-bin-2023.20230311.svn29741-93.1.aarch64.rpm"
RPM_HASH = "004d852a5c428a431ece6de1916231291e4a4f35d6d32c004ce8c3315ea65d37e989e72df317d7ac848fb6fea1b26003e95dbf957f7613410ce7b3a3fc8da5c2"

RPROVIDES:${PN} += "texlive-texdoctk-bin"

RDEPENDS:${PN} += "texlive-texdoctk"

inherit rpm
