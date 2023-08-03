SUMMARY = "Documentation for texlive-pst-mirror"
DESCRIPTION = "This package includes the documentation for texlive-pst-mirror"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn60506"

RPM_NAME = "texlive-pst-mirror-doc-2023.209.1.02svn60506-53.1.noarch.rpm"
RPM_HASH = "86912abc78aabdce92c718dcef9a4c552c55541ff50bddabbe170fd3efff9a81e5887efb046e6fceef6ba5effc2104921a1fbabf61b0d21fd882709a13b7ef66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-mirror-doc-fr \
texlive-pst-mirror-doc"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh"

inherit rpm
