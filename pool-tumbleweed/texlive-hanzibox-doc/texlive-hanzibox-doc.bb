SUMMARY = "Documentation for texlive-hanzibox"
DESCRIPTION = "This package includes the documentation for texlive-hanzibox"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3.0svn63062"

RPM_NAME = "texlive-hanzibox-doc-2023.201.2.3.0svn63062-53.2.noarch.rpm"
RPM_HASH = "f34507a7198de7b0364f2b1e00b024bd2b1f7bade65a52674511e324f25944d1ab5ca792c14bf36e8acfa6fe163752a7b62a19c97912c088f2fcf88e0a0e6f14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hanzibox-doc-zh \
texlive-hanzibox-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
