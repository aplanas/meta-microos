SUMMARY = "Documentation for texlive-here"
DESCRIPTION = "This package includes the documentation for texlive-here"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn16135"

RPM_NAME = "texlive-here-doc-2023.201.svn16135-53.1.noarch.rpm"
RPM_HASH = "6e7437afbe4362733fa87bd5c4eb2b8cbc1de29f7d11e49c02075aa339fd62af946df5f53f8d444a54c4fdd9875e2dbe43fe435cb83046b874098f84460cbdfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-here-doc"

RDEPENDS:${PN} += ""

inherit rpm
