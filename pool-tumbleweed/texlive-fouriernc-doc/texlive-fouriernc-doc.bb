SUMMARY = "Documentation for texlive-fouriernc"
DESCRIPTION = "This package includes the documentation for texlive-fouriernc"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29646"

RPM_NAME = "texlive-fouriernc-doc-2023.209.svn29646-53.1.noarch.rpm"
RPM_HASH = "0f6fc979ee6595767e78d10b46c1062aa6156d11db24add43d18737f1cabbf48be6ce691be5822a6ad5cf69608a85a4a26af15c0b873177b53ad3231aadc2127"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fouriernc-doc"

RDEPENDS:${PN} += ""

inherit rpm
