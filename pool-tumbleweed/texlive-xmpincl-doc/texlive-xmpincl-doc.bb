SUMMARY = "Documentation for texlive-xmpincl"
DESCRIPTION = "This package includes the documentation for texlive-xmpincl"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.4svn60593"

RPM_NAME = "texlive-xmpincl-doc-2023.201.2.4svn60593-52.2.noarch.rpm"
RPM_HASH = "cc54f40d6d2f6ea5353fb9c3a59860cbc62aba9ded76f4436f1b3708f22adcc802a8da560425d69a4576f409f07ce331be1733468a5062ca4c6e3037b87d1115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmpincl-doc"

RDEPENDS:${PN} += ""

inherit rpm
