SUMMARY = "Documentation for texlive-textcsc"
DESCRIPTION = "This package includes the documentation for texlive-textcsc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn64935"

RPM_NAME = "texlive-textcsc-doc-2023.209.1.0.1svn64935-55.1.noarch.rpm"
RPM_HASH = "e9008241935ba91a0d2b7870fd91ee012bc5b390658495a7849fc37048f2014588e3c449b6e8a33eb1bf4ed50b286e774ca7dc8e89a0b4d8840df44b7aee4dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textcsc-doc"

RDEPENDS:${PN} += ""

inherit rpm
