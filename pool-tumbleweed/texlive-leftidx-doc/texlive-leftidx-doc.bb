SUMMARY = "Documentation for texlive-leftidx"
DESCRIPTION = "This package includes the documentation for texlive-leftidx"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-leftidx-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "7ea4037c3c856bb71b6eeab4840bfc155e41b5b948eb8f749342481739b7a9ae9ce1a469b67f40afe641a9076733506215644910656737cfc9b0b4c893695933"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leftidx-doc"

RDEPENDS:${PN} += ""

inherit rpm
