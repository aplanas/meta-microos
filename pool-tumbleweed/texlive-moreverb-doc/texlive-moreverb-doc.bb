SUMMARY = "Documentation for texlive-moreverb"
DESCRIPTION = "This package includes the documentation for texlive-moreverb"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3asvn22126"

RPM_NAME = "texlive-moreverb-doc-2023.209.2.3asvn22126-55.1.noarch.rpm"
RPM_HASH = "e81ff57ff535bdae4c3de09421fb87fd99f06775c865a22fc973d4d3e9ebb9cf569144c57907301230ccd57937eeabd54def5893bf2a708bc8c4972bcf2f90c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moreverb-doc"

RDEPENDS:${PN} += ""

inherit rpm
