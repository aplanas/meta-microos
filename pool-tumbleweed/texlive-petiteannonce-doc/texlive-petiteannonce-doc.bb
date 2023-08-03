SUMMARY = "Documentation for texlive-petiteannonce"
DESCRIPTION = "This package includes the documentation for texlive-petiteannonce"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0001svn25915"

RPM_NAME = "texlive-petiteannonce-doc-2023.209.1.0001svn25915-52.1.noarch.rpm"
RPM_HASH = "4016fed0b0e54c7cff49881102d7ab7363229c7ef409a82a644e081987c42aa85d0cffb8e8671f2838d6ed7421c6274a9ac181e039451c9fff730753abef0a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-petiteannonce-doc"

RDEPENDS:${PN} += ""

inherit rpm
