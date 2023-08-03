SUMMARY = "Documentation for texlive-prosper"
DESCRIPTION = "This package includes the documentation for texlive-prosper"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0hsvn33033"

RPM_NAME = "texlive-prosper-doc-2023.209.1.0hsvn33033-53.1.noarch.rpm"
RPM_HASH = "bf341951915574f5a2e5da6966fe9322741eb09aba1a870d58420614bcdf8a11d0bbb410500b5dda726b2e8d84ad1100f5b2d97405b54d0559214cb934223f59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prosper-doc"

RDEPENDS:${PN} += ""

inherit rpm
