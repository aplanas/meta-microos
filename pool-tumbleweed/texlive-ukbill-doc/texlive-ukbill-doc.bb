SUMMARY = "Documentation for texlive-ukbill"
DESCRIPTION = "This package includes the documentation for texlive-ukbill"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn65485"

RPM_NAME = "texlive-ukbill-doc-2023.201.1.0.2svn65485-53.1.noarch.rpm"
RPM_HASH = "7b681ac7ad237fb7575f238ff6bda6ed1f563d07f202b15566b41c8396d1753f57cde59bf2f02fbb83fd7db471266e8387d02f7fe4334478a850e792b1375d83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ukbill-doc"

RDEPENDS:${PN} += ""

inherit rpm
