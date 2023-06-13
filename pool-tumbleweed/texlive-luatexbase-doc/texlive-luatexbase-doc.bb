SUMMARY = "Documentation for texlive-luatexbase"
DESCRIPTION = "This package includes the documentation for texlive-luatexbase"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn52663"

RPM_NAME = "texlive-luatexbase-doc-2023.201.1.3svn52663-52.1.noarch.rpm"
RPM_HASH = "f91f58ca3741c50583213a79174fc8301b9e401be0dbdff4f1b7fc4309fce3d76092a5459a0580f8844f356da3a2e84adfd5519dc981c84c566af967aa7737da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatexbase-doc"

RDEPENDS:${PN} += ""

inherit rpm
