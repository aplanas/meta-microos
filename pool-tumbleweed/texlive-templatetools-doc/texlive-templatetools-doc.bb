SUMMARY = "Documentation for texlive-templatetools"
DESCRIPTION = "This package includes the documentation for texlive-templatetools"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn34495"

RPM_NAME = "texlive-templatetools-doc-2023.201.svn34495-54.1.noarch.rpm"
RPM_HASH = "398b61bbc7eaca7ecacdfa00b9b4d0a266fc41977c2905c76b444b2750f4fcac66f2c854606480987062eb56cdb49d90d8bed20b60526093fe7d780f13318297"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-templatetools-doc"
RDEPENDS:${PN} += ""

inherit rpm
