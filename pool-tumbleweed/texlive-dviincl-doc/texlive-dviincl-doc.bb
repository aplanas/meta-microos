SUMMARY = "Documentation for texlive-dviincl"
DESCRIPTION = "This package includes the documentation for texlive-dviincl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.00svn29349"

RPM_NAME = "texlive-dviincl-doc-2023.209.1.00svn29349-54.1.noarch.rpm"
RPM_HASH = "bc2cf4c28ae73af1ff84120ed1c9fbbf6743146d08baf15ad2f78cb0bc3cfcd103ff70bc449dd8f63a6fa5efeb31e206cf83944d9889c20f226beef7c549ca26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dviincl-doc-en;pl \
texlive-dviincl-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
