SUMMARY = "Documentation for texlive-randomlist"
DESCRIPTION = "This package includes the documentation for texlive-randomlist"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn45281"

RPM_NAME = "texlive-randomlist-doc-2023.209.1.3svn45281-54.2.noarch.rpm"
RPM_HASH = "5c624ac4f1bb0b5b28760a1a971e2790f049570ba3e509820e84463ba20aeaf447817787a5d650436b7b77136b612ff1951f6a3996ec60920e12f378bd691801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randomlist-doc"

RDEPENDS:${PN} += ""

inherit rpm
