SUMMARY = "Documentation for texlive-tipa"
DESCRIPTION = "This package includes the documentation for texlive-tipa"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn29349"

RPM_NAME = "texlive-tipa-doc-2023.209.1.3svn29349-53.1.noarch.rpm"
RPM_HASH = "34fbcd8c88114f1b02b9b8c8147e84b3ae9c4af2df3dc6af2f233e47c271f679b989998b11431e6fe0de6c80ac2fee352e8a22d52b0bb34862350a9d1da2e7ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tipa-doc-en \
texlive-tipa-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
