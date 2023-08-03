SUMMARY = "Documentation for texlive-na-position"
DESCRIPTION = "This package includes the documentation for texlive-na-position"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn55559"

RPM_NAME = "texlive-na-position-doc-2023.209.1.2svn55559-55.1.noarch.rpm"
RPM_HASH = "e52a39d546018dfe25943cf52e6711a72bc337a227c3b8b15f4f46cb0dd6991fdff02b8d93cd7bd4424c0cf1095637feddb1999c6334d249c5b1e5d5179e60e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-na-position-doc-ar \
texlive-na-position-doc"

RDEPENDS:${PN} += ""

inherit rpm
