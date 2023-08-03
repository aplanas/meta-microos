SUMMARY = "Documentation for texlive-srbook-mem"
DESCRIPTION = "This package includes the documentation for texlive-srbook-mem"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn45818"

RPM_NAME = "texlive-srbook-mem-doc-2023.209.svn45818-58.1.noarch.rpm"
RPM_HASH = "f709f4fbb8c6537fb45f3f6f25cca2277b5a9b11fe3ec998732b01c55780351aa3719024fac1749a53ab7073a414eb64982f4169a43457f910d4630d912de90b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-srbook-mem-doc"

RDEPENDS:${PN} += ""

inherit rpm
