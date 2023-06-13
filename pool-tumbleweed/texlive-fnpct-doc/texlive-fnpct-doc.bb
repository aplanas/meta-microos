SUMMARY = "Documentation for texlive-fnpct"
DESCRIPTION = "This package includes the documentation for texlive-fnpct"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1asvn62248"

RPM_NAME = "texlive-fnpct-doc-2023.201.1.1asvn62248-52.1.noarch.rpm"
RPM_HASH = "e488c788f846f85b7c522b4a57478f60fd115ad7ac7f745c31db11c0eef6a13f51fe10bd3d9e89d341dc302633c34b59a8890852db7c0f0c0acc478374c840a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fnpct-doc"

RDEPENDS:${PN} += ""

inherit rpm
