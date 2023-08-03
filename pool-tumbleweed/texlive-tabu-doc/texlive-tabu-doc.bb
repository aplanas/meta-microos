SUMMARY = "Documentation for texlive-tabu"
DESCRIPTION = "This package includes the documentation for texlive-tabu"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.9svn61719"

RPM_NAME = "texlive-tabu-doc-2023.209.2.9svn61719-55.1.noarch.rpm"
RPM_HASH = "857b9e08e33cda250d33cf3562838e99e71550ddf8fac6780bff0f5ff8970914a455e5ddec09bfaccded264711a4cb8f8786c4d8ecbd9bb74da2ab2ffcc6e264"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabu-doc"

RDEPENDS:${PN} += ""

inherit rpm
