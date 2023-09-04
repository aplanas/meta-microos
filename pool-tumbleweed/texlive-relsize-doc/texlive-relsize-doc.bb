SUMMARY = "Documentation for texlive-relsize"
DESCRIPTION = "This package includes the documentation for texlive-relsize"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.4.1svn30707"

RPM_NAME = "texlive-relsize-doc-2023.209.4.1svn30707-54.2.noarch.rpm"
RPM_HASH = "c2c4bce54af51703d633a80e95dcaead673a4a4f95b2b3057ee4320b684be5ee6609cecefbc56a15efac592d5e8b5837cdc6f22396c90afccd7bc344d302514f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-relsize-doc"

RDEPENDS:${PN} += ""

inherit rpm
