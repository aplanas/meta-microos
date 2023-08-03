SUMMARY = "Documentation for texlive-cbfonts-fd"
DESCRIPTION = "This package includes the documentation for texlive-cbfonts-fd"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn54080"

RPM_NAME = "texlive-cbfonts-fd-doc-2023.209.1.2svn54080-53.1.noarch.rpm"
RPM_HASH = "6b4baa2ff7f251b3c19525b46168896a15b5e58cc2104fdf9d96ba7d40b09662af89b46a39840610d9c989c8cc2ee441e8afd7bc9722b18f3a5f840c1decac37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cbfonts-fd-doc"

RDEPENDS:${PN} += ""

inherit rpm
