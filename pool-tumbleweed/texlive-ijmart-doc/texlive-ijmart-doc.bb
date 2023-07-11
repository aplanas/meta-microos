SUMMARY = "Documentation for texlive-ijmart"
DESCRIPTION = "This package includes the documentation for texlive-ijmart"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.7svn30958"

RPM_NAME = "texlive-ijmart-doc-2023.208.1.7svn30958-53.1.noarch.rpm"
RPM_HASH = "98ab91bba676dcacbc16de120aa410e18a883cc49d2d6da7a29dcbcba8ead6fa5583862d650303bffb072f91213ff151c61b52713a3f46ec5fb9e556addd3574"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijmart-doc"

RDEPENDS:${PN} += ""

inherit rpm
