SUMMARY = "Documentation for texlive-verbasef"
DESCRIPTION = "This package includes the documentation for texlive-verbasef"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn21922"

RPM_NAME = "texlive-verbasef-doc-2023.209.1.1svn21922-54.1.noarch.rpm"
RPM_HASH = "09f0384245765bb10476e762e6ea59d67430cf3e3abe17153f1dd917495f043bf8279b300b66af8b1b0c3cda2e3832cf3fe8eb46e60e4e7268acb45113e84ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbasef-doc"

RDEPENDS:${PN} += ""

inherit rpm
