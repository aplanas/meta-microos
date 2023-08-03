SUMMARY = "Documentation for texlive-multiexpand"
DESCRIPTION = "This package includes the documentation for texlive-multiexpand"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn45943"

RPM_NAME = "texlive-multiexpand-doc-2023.209.1.5svn45943-55.1.noarch.rpm"
RPM_HASH = "26ba2c29b00800d8b1c73d1df38bff975e8ae6dd911e03afd16354ced6a69bf47d0008ba114e141db1b4bcc7819259c7560bfd823740d983261456cfb3fe6ac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multiexpand-doc"

RDEPENDS:${PN} += ""

inherit rpm
