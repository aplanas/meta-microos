SUMMARY = "Binary files of kotex-utils"
DESCRIPTION = "Binary files of kotex-utils"
LICENSE = "LPPL-1.0"

PV = "2023.20230311.svn32101"

RPM_NAME = "texlive-kotex-utils-bin-2023.20230311.svn32101-91.1.aarch64.rpm"
RPM_HASH = "23dafadcd5cb16d82a5292fbec01e9eba39cc2f8f54bcdcab6400d89d21c89027908bd2ddead364379ffcf25641af533205ea59dac5c5e5d8fa3b20b2d7bd4fd"

RPROVIDES:${PN} += "texlive-kotex-utils-bin \
texlive-kotex-utils-bin(aarch-64)"

RDEPENDS:${PN} += "texlive-kotex-utils"

inherit rpm
