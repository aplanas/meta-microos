SUMMARY = "Documentation for texlive-hepnames"
DESCRIPTION = "This package includes the documentation for texlive-hepnames"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn35722"

RPM_NAME = "texlive-hepnames-doc-2023.209.2.0svn35722-54.2.noarch.rpm"
RPM_HASH = "4dcf3192ebe629f558c275a6ae256f70f185912e10214495d2ce08d358eea336d5e495667e6386599812c2eec1b8facca987807277b7c507bdb8b64b3ccee108"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepnames-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
