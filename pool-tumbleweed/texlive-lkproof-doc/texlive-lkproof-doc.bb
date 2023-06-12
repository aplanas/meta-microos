SUMMARY = "Documentation for texlive-lkproof"
DESCRIPTION = "This package includes the documentation for texlive-lkproof"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.3.1svn20021"

RPM_NAME = "texlive-lkproof-doc-2023.201.3.1svn20021-54.1.noarch.rpm"
RPM_HASH = "0053ef5ef906aeb87adaac2da5607b5431ec8f7dff9cfe68812f770e8b5e7de2ba0b74a692dc0efa3265be758eb25e7aba9432df5719dc6096002a6d2ac03c19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lkproof-doc"
RDEPENDS:${PN} += ""

inherit rpm
