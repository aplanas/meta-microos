SUMMARY = "Documentation for texlive-gfnotation"
DESCRIPTION = "This package includes the documentation for texlive-gfnotation"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.9svn37156"

RPM_NAME = "texlive-gfnotation-doc-2023.209.2.9svn37156-53.1.noarch.rpm"
RPM_HASH = "1ea7c7afbf25801b35799a6782a8a1ddf15ffa60be46fbf920d7cd97d7f6482d28987b499ecfbaec4d45dc3fec7a81f0b82ba7be5737f0f4268f870f73d9f186"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfnotation-doc"

RDEPENDS:${PN} += ""

inherit rpm
