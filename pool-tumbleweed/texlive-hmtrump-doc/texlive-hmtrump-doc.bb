SUMMARY = "Documentation for texlive-hmtrump"
DESCRIPTION = "This package includes the documentation for texlive-hmtrump"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn54512"

RPM_NAME = "texlive-hmtrump-doc-2023.209.1.2asvn54512-54.2.noarch.rpm"
RPM_HASH = "42fdff18469c5baab9e8ccf741a5aa2f7c0b1e35ccc671cfed45e475c2345e45ca701498d51476b696c6695bb16f776e032d3322ba3adc4c6ed57d31d9043a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hmtrump-doc-ja \
texlive-hmtrump-doc"

RDEPENDS:${PN} += ""

inherit rpm
