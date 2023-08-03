SUMMARY = "Documentation for texlive-kastrup"
DESCRIPTION = "This package includes the documentation for texlive-kastrup"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-kastrup-doc-2023.209.svn15878-56.1.noarch.rpm"
RPM_HASH = "056d87a2f7728f8efeaae18e61ddeac6cddc008357ab3ba3fa777dadaafe71bda15d161e52a4f8d7919e997223da0b4be98f6a9ab81a8b8907ccf0059ebef763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kastrup-doc"

RDEPENDS:${PN} += ""

inherit rpm
