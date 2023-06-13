SUMMARY = "Documentation for texlive-pawpict"
DESCRIPTION = "This package includes the documentation for texlive-pawpict"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn21629"

RPM_NAME = "texlive-pawpict-doc-2023.201.1.0svn21629-51.1.noarch.rpm"
RPM_HASH = "8c50b2f3a39588dc062cdfb556e4519ea20ec15df3080d73286a3ff4d33d749736d2119791163777a8818d4c6c63ef76b271fbeb07f05bae4b2a85b677529f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pawpict-doc"

RDEPENDS:${PN} += ""

inherit rpm
