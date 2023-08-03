SUMMARY = "Documentation for texlive-movie15"
DESCRIPTION = "This package includes the documentation for texlive-movie15"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn26473"

RPM_NAME = "texlive-movie15-doc-2023.209.svn26473-55.1.noarch.rpm"
RPM_HASH = "9cd7325643a17e9e97bca8eb75cd52bbb1f47c44dbec2cd47dc63d2063dfa1624161a49e7f7ffa857cd27de75c3ea4ef8d42eef77d9d26412b0093363a05a9bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-movie15-doc"

RDEPENDS:${PN} += ""

inherit rpm
