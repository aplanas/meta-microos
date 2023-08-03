SUMMARY = "Documentation for texlive-block"
DESCRIPTION = "This package includes the documentation for texlive-block"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn17209"

RPM_NAME = "texlive-block-doc-2023.209.svn17209-53.1.noarch.rpm"
RPM_HASH = "595570c7051ec49764052e7bf075ff653131f35e20da3aea991e4e645674756acb9c1a12343ba0f5e4b97c625493f881f7d1b487a76adbc839434b34dd575421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-block-doc"

RDEPENDS:${PN} += ""

inherit rpm
