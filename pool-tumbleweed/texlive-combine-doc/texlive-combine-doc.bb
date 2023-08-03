SUMMARY = "Documentation for texlive-combine"
DESCRIPTION = "This package includes the documentation for texlive-combine"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7asvn19361"

RPM_NAME = "texlive-combine-doc-2023.209.0.0.7asvn19361-54.1.noarch.rpm"
RPM_HASH = "5226ed6100795084b58e1b028631d99a4bdf64c79c622306afdc9b99a23cf70e240bc92dd83ec291cbdf74dcd51728050d49354ec528d82dff409dc04ec73734"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-combine-doc"

RDEPENDS:${PN} += ""

inherit rpm
