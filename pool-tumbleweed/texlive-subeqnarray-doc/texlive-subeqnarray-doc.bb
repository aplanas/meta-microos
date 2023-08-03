SUMMARY = "Documentation for texlive-subeqnarray"
DESCRIPTION = "This package includes the documentation for texlive-subeqnarray"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1csvn15878"

RPM_NAME = "texlive-subeqnarray-doc-2023.209.2.1csvn15878-58.1.noarch.rpm"
RPM_HASH = "2fcff936f44a855f1ebe820be658fddb7777e871bfd270267dc85a3b3b05c00aec1d34fb2977e087f786e633985d7d9e101e77e751ebc1e5a0641238130567ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subeqnarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
