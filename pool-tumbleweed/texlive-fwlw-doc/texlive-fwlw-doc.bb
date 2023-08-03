SUMMARY = "Documentation for texlive-fwlw"
DESCRIPTION = "This package includes the documentation for texlive-fwlw"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29803"

RPM_NAME = "texlive-fwlw-doc-2023.209.svn29803-53.1.noarch.rpm"
RPM_HASH = "90809b3eb1be7d3df026ab1b57d84d4a0b55c8dc6e041b11c7525bbd97f132ccb573485f9ae806961dea5ea38fcb1384857559618279682fee06f7be1fd2ebf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fwlw-doc"

RDEPENDS:${PN} += ""

inherit rpm
