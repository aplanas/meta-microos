SUMMARY = "Documentation for texlive-shuffle"
DESCRIPTION = "This package includes the documentation for texlive-shuffle"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-shuffle-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "c2c61c4cd408b9df1e4d419e45de506886dbb63bf56eda4bee35554b1f0df789cdc26c215cdb3837082045a6721d7ad729a7695714a1275be1c04a44755c0e0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shuffle-doc"

RDEPENDS:${PN} += ""

inherit rpm
