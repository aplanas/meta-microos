SUMMARY = "Documentation for texlive-ijmart"
DESCRIPTION = "This package includes the documentation for texlive-ijmart"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn30958"

RPM_NAME = "texlive-ijmart-doc-2023.209.1.7svn30958-54.1.noarch.rpm"
RPM_HASH = "f8c506c26c9a2c509ea60ac92b3372dc9b064114fb2a57c761f1bb1771d3dabd26a279b4cb33d525a2f9cbb42abc35581d0c454042e45c4aa90bca0dbfe937cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ijmart-doc"

RDEPENDS:${PN} += ""

inherit rpm
