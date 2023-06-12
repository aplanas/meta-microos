SUMMARY = "Documentation for texlive-atbegshi"
DESCRIPTION = "This package includes the documentation for texlive-atbegshi"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.19svn53051"

RPM_NAME = "texlive-atbegshi-doc-2023.201.1.19svn53051-53.1.noarch.rpm"
RPM_HASH = "7b9df9b2bfa54790527f32480d084e572f28b63aa93c0bdb7147d655b13c2ec33256f00a3bd524d76049db189fd3ffadd7b0f88738b3f14d64f03471eab6a930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atbegshi-doc"
RDEPENDS:${PN} += ""

inherit rpm
