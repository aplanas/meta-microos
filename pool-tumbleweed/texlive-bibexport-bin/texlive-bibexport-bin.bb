SUMMARY = "Binary files of bibexport"
DESCRIPTION = "Binary files of bibexport"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn16219"

RPM_NAME = "texlive-bibexport-bin-2023.20230311.svn16219-92.1.aarch64.rpm"
RPM_HASH = "728fff355cdb4b3983513966d2282d4e59c7a17605b2ebce9dfb172cdc7a4ec4046b7158dadd4ae1e9044438853a8f06810d4e8cdf5e2d368a841f5e67e68819"

RPROVIDES:${PN} += "texlive-bibexport-bin"

RDEPENDS:${PN} += "texlive-bibexport"

inherit rpm
