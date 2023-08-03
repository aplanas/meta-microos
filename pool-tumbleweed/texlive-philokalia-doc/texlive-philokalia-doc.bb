SUMMARY = "Documentation for texlive-philokalia"
DESCRIPTION = "This package includes the documentation for texlive-philokalia"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn45356"

RPM_NAME = "texlive-philokalia-doc-2023.209.1.2svn45356-52.1.noarch.rpm"
RPM_HASH = "48a5b91a668d86bfad99aba89e9e3eafdf4946e9ca5a36d9cd6dc2e55e9a847a3c28a7a34292448a335fca47c3cb1f84403825f8bb207b6997b92e9b36dc26b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-philokalia-doc"

RDEPENDS:${PN} += ""

inherit rpm
