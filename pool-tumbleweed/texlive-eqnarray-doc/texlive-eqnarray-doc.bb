SUMMARY = "Documentation for texlive-eqnarray"
DESCRIPTION = "This package includes the documentation for texlive-eqnarray"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn20641"

RPM_NAME = "texlive-eqnarray-doc-2023.209.1.3svn20641-54.1.noarch.rpm"
RPM_HASH = "f79173f171a2d3446fcbe8966f4be853e695ee1743198e15804901fd841062e2ca5f97d9a51b89f090b8ccd2175793a6073984f47e203fd4bb770ce3de340cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnarray-doc"

RDEPENDS:${PN} += ""

inherit rpm
