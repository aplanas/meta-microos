SUMMARY = "Documentation for texlive-xypic"
DESCRIPTION = "This package includes the documentation for texlive-xypic"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.8.9svn61719"

RPM_NAME = "texlive-xypic-doc-2023.209.3.8.9svn61719-53.1.noarch.rpm"
RPM_HASH = "0b158a7f8eb0467fd5df7838d5b94b2d62fb450a8d4d9e17ac08d852e421fb20e550b73a78de4c97f67fcf047c6b5c9c431ff8d49fba2bf64e6b79e024798601"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xypic-doc-en \
texlive-xypic-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
