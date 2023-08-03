SUMMARY = "Documentation for texlive-miller"
DESCRIPTION = "This package includes the documentation for texlive-miller"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn18789"

RPM_NAME = "texlive-miller-doc-2023.209.1.2svn18789-55.1.noarch.rpm"
RPM_HASH = "d5cf4a1fb2f456fc04d8611b0967a62810d23656309d6d7da52ab98405df02084a771973a6453f5678ebcd61bcdd54efe2d3e38e0d15e2ec42bf05d5815204ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-miller-doc"

RDEPENDS:${PN} += ""

inherit rpm
