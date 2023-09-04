SUMMARY = "Documentation for texlive-icsv"
DESCRIPTION = "This package includes the documentation for texlive-icsv"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-icsv-doc-2023.209.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "a0b5122e6f37a0f25d7ea341be0dcc282a02d1a9806c6208c01d62c02db57a282cb3851a4ce2c86585c5b66aa6397770a0e3778592d0f21ca49541109d1b128a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-icsv-doc"

RDEPENDS:${PN} += ""

inherit rpm
