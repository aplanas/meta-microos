SUMMARY = "Documentation for texlive-dramatist"
DESCRIPTION = "This package includes the documentation for texlive-dramatist"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.2esvn35866"

RPM_NAME = "texlive-dramatist-doc-2023.201.1.2esvn35866-52.1.noarch.rpm"
RPM_HASH = "ff38e4790c48ca6064530e9e1e326426da61e3d543a16fcf9d71e24be01d630ce5b8bf271c3adb8fe78fb7bafdb1819dd761b33d52cd4f988bbfb9eabd239403"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dramatist-doc"
RDEPENDS:${PN} += ""

inherit rpm
