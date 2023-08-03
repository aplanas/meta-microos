SUMMARY = "Documentation for texlive-fragments"
DESCRIPTION = "This package includes the documentation for texlive-fragments"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-fragments-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "c98016bfc3ed4a56cd1c556bc0d20b627d950cb193b637f64b025f830f07bf2a824683682b31713d520ac25eee259d78b06a8f9b0c9ae6d64f019accb1c65df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fragments-doc"

RDEPENDS:${PN} += ""

inherit rpm
