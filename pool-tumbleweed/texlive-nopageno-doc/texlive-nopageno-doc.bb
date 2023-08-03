SUMMARY = "Documentation for texlive-nopageno"
DESCRIPTION = "This package includes the documentation for texlive-nopageno"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18128"

RPM_NAME = "texlive-nopageno-doc-2023.209.svn18128-55.1.noarch.rpm"
RPM_HASH = "0db195c3ee8a168bcd2352dde5c5609ae8ee5637306179be7e3cb55788facde8c709e9b96938af5484f5e018afdc1b0fa5c57ca5ca7c60668b39b6d85aa24492"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nopageno-doc"

RDEPENDS:${PN} += ""

inherit rpm
