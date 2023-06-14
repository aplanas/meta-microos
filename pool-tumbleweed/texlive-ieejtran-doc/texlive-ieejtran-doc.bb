SUMMARY = "Documentation for texlive-ieejtran"
DESCRIPTION = "This package includes the documentation for texlive-ieejtran"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.19svn65641"

RPM_NAME = "texlive-ieejtran-doc-2023.201.0.0.19svn65641-52.1.noarch.rpm"
RPM_HASH = "1e993f035df66a2dd8d2d1f6a754a719fbb01f55ee2b5acb6f7c759b2911066297b10e48e4479615c1b2287fa418f5c0e31490db16f97ab63c2ce88fc1c902f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ieejtran-doc-ja \
texlive-ieejtran-doc"

RDEPENDS:${PN} += ""

inherit rpm
