SUMMARY = "Documentation for texlive-ushort"
DESCRIPTION = "This package includes the documentation for texlive-ushort"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn32261"

RPM_NAME = "texlive-ushort-doc-2023.209.2.2svn32261-54.1.noarch.rpm"
RPM_HASH = "a36544194213c2eda740dc2e10b9f1537b573ec02bdf56d0e624ca6f23bb595bfbe64956bda6d6df8f63faf4764b4286e2a60606f93a4d9a5c0855f0557bf5f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ushort-doc"

RDEPENDS:${PN} += ""

inherit rpm
