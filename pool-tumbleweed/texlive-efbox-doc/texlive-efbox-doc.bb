SUMMARY = "Documentation for texlive-efbox"
DESCRIPTION = "This package includes the documentation for texlive-efbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn33236"

RPM_NAME = "texlive-efbox-doc-2023.209.1.0svn33236-54.1.noarch.rpm"
RPM_HASH = "a0f2dafc40379708ebe156db7c1a0efd05fd0f0a7b94b33cf4c1e395c572fb9423414bbf7be70107ca570dbdee9762f4e1de61bb731ca1c510e3106b2a132c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-efbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
