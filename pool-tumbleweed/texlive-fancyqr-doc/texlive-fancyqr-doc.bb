SUMMARY = "Documentation for texlive-fancyqr"
DESCRIPTION = "This package includes the documentation for texlive-fancyqr"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn64182"

RPM_NAME = "texlive-fancyqr-doc-2023.209.1.1svn64182-53.1.noarch.rpm"
RPM_HASH = "e7f99ed5e2a7a7ad6a339820186657bcf849172032cccddee45d80ab8e93a17f0b9e5f1fe4185fd45bff6016ed1115434f741c9e50020ac8f5700f699d667b4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyqr-doc"

RDEPENDS:${PN} += ""

inherit rpm
