SUMMARY = "Documentation for texlive-pwebmac"
DESCRIPTION = "This package includes the documentation for texlive-pwebmac"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.4.8.1svn63731"

RPM_NAME = "texlive-pwebmac-doc-2023.209.4.8.1svn63731-54.2.noarch.rpm"
RPM_HASH = "aadf01f93dae86ee0befd250e4fb314a0423d83e34bcf8064de1812c1347788ade9dad0d6f9f0ed8b967360880ba468d5aedf8586bc3b89c70479bcd04cdeff9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pwebmac-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
