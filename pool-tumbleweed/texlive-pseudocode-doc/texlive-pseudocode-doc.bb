SUMMARY = "Documentation for texlive-pseudocode"
DESCRIPTION = "This package includes the documentation for texlive-pseudocode"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54080"

RPM_NAME = "texlive-pseudocode-doc-2023.209.svn54080-53.1.noarch.rpm"
RPM_HASH = "f78be7b82de6d859cf388080a8b504f41806cc55e498f563023635574b9e34974617f0041abad4e8dd5ae9d758c2bee27c397c7c4b2a88041eaf44df35231b1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pseudocode-doc"

RDEPENDS:${PN} += ""

inherit rpm
