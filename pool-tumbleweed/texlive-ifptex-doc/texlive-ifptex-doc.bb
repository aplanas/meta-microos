SUMMARY = "Documentation for texlive-ifptex"
DESCRIPTION = "This package includes the documentation for texlive-ifptex"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn62982"

RPM_NAME = "texlive-ifptex-doc-2023.209.2.2svn62982-54.1.noarch.rpm"
RPM_HASH = "01b7b244bc75220114989737e11115d41dc9ea4611b1ddab0e08b3cf7c4bcd6ed5a97e9abf3c03d0ecd1bebb47480e06d10a5cfa21e83846f06d5d0948a8c9e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ifptex-doc-ja \
texlive-ifptex-doc"

RDEPENDS:${PN} += ""

inherit rpm
