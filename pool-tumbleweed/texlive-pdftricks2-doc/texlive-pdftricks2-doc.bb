SUMMARY = "Documentation for texlive-pdftricks2"
DESCRIPTION = "This package includes the documentation for texlive-pdftricks2"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.01svn31016"

RPM_NAME = "texlive-pdftricks2-doc-2023.201.1.01svn31016-51.1.noarch.rpm"
RPM_HASH = "f31406d8ecec6c4ee05ce1f673e36a0e153513d892a0e20c9db80722a47d48ffc4f27008cae994cd5bcced67f9130e154d95cc1994d165dd2546b31f483543c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdftricks2-doc"

RDEPENDS:${PN} += ""

inherit rpm
