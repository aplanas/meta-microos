SUMMARY = "Documentation for texlive-adforn"
DESCRIPTION = "This package includes the documentation for texlive-adforn"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn54512"

RPM_NAME = "texlive-adforn-doc-2023.209.1.1bsvn54512-55.1.noarch.rpm"
RPM_HASH = "77226e7f58f084fb8e0c519c2f1f19a64b6123db722a823cee8cf40603bbab0071d19a5bc7f1ac3a73e28d09be3ad87b2a4cda8bc38ff452c81bef1917f8a7af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adforn-doc"

RDEPENDS:${PN} += ""

inherit rpm
