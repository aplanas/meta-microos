SUMMARY = "Documentation for texlive-babel-russian"
DESCRIPTION = "This package includes the documentation for texlive-babel-russian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3msvn57376"

RPM_NAME = "texlive-babel-russian-doc-2023.209.1.3msvn57376-54.1.noarch.rpm"
RPM_HASH = "3aa1e2a9fd9966246cef1b48aa24789aa6250f5f7030632eb49b1ec1752ebb2e818398f4dfa914811c26c0011af04b79f20a6c6d24d2935289f73ddecdf56892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-russian-doc"

RDEPENDS:${PN} += ""

inherit rpm
