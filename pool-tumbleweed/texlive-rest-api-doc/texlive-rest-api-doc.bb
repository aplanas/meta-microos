SUMMARY = "Documentation for texlive-rest-api"
DESCRIPTION = "This package includes the documentation for texlive-rest-api"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn57068"

RPM_NAME = "texlive-rest-api-doc-2023.209.1.4svn57068-54.1.noarch.rpm"
RPM_HASH = "174f6aa3b0ffa21bccbe314f1b2e1f701036818c2254075e56de65c2aa49e3ae1cecf4148c3cbe377a1286c2b65f1a3a09c3a31791021e35c0ee899c5c4289d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rest-api-doc"

RDEPENDS:${PN} += ""

inherit rpm
