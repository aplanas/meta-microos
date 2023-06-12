SUMMARY = "Documentation for texlive-pxfonts"
DESCRIPTION = "This package includes the documentation for texlive-pxfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pxfonts-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "0fd23892778b0f0a66e0e0249528d25c2b4a8286cfe75c34cada549035aeb71b222c3cfcf739131d5a0c18cd1692114aac6b11619f831dca6a00f67b514c9618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxfonts-doc"
RDEPENDS:${PN} += ""

inherit rpm
