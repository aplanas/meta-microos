SUMMARY = "Documentation for texlive-dviincl"
DESCRIPTION = "This package includes the documentation for texlive-dviincl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.00svn29349"

RPM_NAME = "texlive-dviincl-doc-2023.209.1.00svn29349-54.2.noarch.rpm"
RPM_HASH = "dd50619ddff1b8b8f5274a0a8a4cb367fb47a00fef0c5975ff10da9b1e457740d1eb6a7e183d29946c00f5378a9ddaf578b9eec72141eb29123994a6ec8b26b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dviincl-doc-en;pl \
texlive-dviincl-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
