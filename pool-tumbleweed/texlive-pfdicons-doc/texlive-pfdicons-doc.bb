SUMMARY = "Documentation for texlive-pfdicons"
DESCRIPTION = "This package includes the documentation for texlive-pfdicons"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn60089"

RPM_NAME = "texlive-pfdicons-doc-2023.209.1.0asvn60089-52.1.noarch.rpm"
RPM_HASH = "9d55ff1ec27224928e7cd47c9b3b7dae77c3af710b9cc70d5b7861eca75e65f80a228fbe38f063c9a5e08c36055f0a8299f0395edf594535a57ec12b9241c505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pfdicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
