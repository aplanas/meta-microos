SUMMARY = "Documentation for texlive-dynkin-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-dynkin-diagrams"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1415926535897932svn58758"

RPM_NAME = "texlive-dynkin-diagrams-doc-2023.201.3.1415926535897932svn58758-53.2.noarch.rpm"
RPM_HASH = "2461fdea5843b48dfd3fe886ed6e3a02140bf53e2ea4c5cec2862c25a918191eb291328c8bd2ed56e61eab4ab4af8f51a4bdaad22b707f858e956618580a8fec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynkin-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm
