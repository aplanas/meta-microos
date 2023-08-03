SUMMARY = "Documentation for texlive-beamertheme-simpledarkblue"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-simpledarkblue"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn60061"

RPM_NAME = "texlive-beamertheme-simpledarkblue-doc-2023.209.svn60061-54.1.noarch.rpm"
RPM_HASH = "386bd9e0a869bab820c805bd89db62f1453848f55e8672b74604fabee17dde39cd5a5f8c87a7ccbd0e456bc5dde5948a99a1b48ac23206ffb73652660b498800"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-simpledarkblue-doc"

RDEPENDS:${PN} += ""

inherit rpm
