SUMMARY = "Documentation for texlive-xmpincl"
DESCRIPTION = "This package includes the documentation for texlive-xmpincl"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.4svn60593"

RPM_NAME = "texlive-xmpincl-doc-2023.201.2.4svn60593-52.1.noarch.rpm"
RPM_HASH = "d6f6119b71028856d9c2fb6b521381b403709ef0067548f23f77220a63badd6d41d8636ab0697f42bfd392d57e6fa59ae5cdad3a92bb32320e90fc7ab49eca34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xmpincl-doc"

RDEPENDS:${PN} += ""

inherit rpm
