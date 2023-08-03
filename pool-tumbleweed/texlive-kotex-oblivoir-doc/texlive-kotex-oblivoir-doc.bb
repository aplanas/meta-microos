SUMMARY = "Documentation for texlive-kotex-oblivoir"
DESCRIPTION = "This package includes the documentation for texlive-kotex-oblivoir"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.1svn66513"

RPM_NAME = "texlive-kotex-oblivoir-doc-2023.209.3.2.1svn66513-56.1.noarch.rpm"
RPM_HASH = "7ef4dad87e132794220a8d9f600cec89f842c2b4157be08e0a98f8d39ad0881bccf3092adc977322e2c8f0edec8820dfe12300db507e7a17e8cbc4f32b31a023"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-kotex-oblivoir-doc-ko \
texlive-kotex-oblivoir-doc"

RDEPENDS:${PN} += ""

inherit rpm
