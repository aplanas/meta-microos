SUMMARY = "Documentation for texlive-elzcards"
DESCRIPTION = "This package includes the documentation for texlive-elzcards"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.60svn51894"

RPM_NAME = "texlive-elzcards-doc-2023.209.1.60svn51894-54.2.noarch.rpm"
RPM_HASH = "6aaef822a4d554fe4858a108dcfe90756945b6c1489775096a41a8134f49e21303b42e4b0654e85d750ce5dbfc5aa80661de897f4dfde9e77f9a0c6c94a830cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elzcards-doc"

RDEPENDS:${PN} += ""

inherit rpm
