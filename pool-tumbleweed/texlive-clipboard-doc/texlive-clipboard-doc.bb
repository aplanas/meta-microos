SUMMARY = "Documentation for texlive-clipboard"
DESCRIPTION = "This package includes the documentation for texlive-clipboard"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn47747"

RPM_NAME = "texlive-clipboard-doc-2023.209.0.0.3svn47747-54.1.noarch.rpm"
RPM_HASH = "55913a1c106906d3e7bbbbf381f2e7706e549a1b3a8a50d4188300db9657bccccae6cac182832e6430e3db15a7fa9244d33de183ab082a4b747af6d0998d9268"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clipboard-doc"

RDEPENDS:${PN} += ""

inherit rpm
