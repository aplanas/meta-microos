SUMMARY = "Documentation for texlive-ejpecp"
DESCRIPTION = "This package includes the documentation for texlive-ejpecp"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11.3svn60950"

RPM_NAME = "texlive-ejpecp-doc-2023.209.1.11.3svn60950-54.2.noarch.rpm"
RPM_HASH = "ec34ed49e510d739faf9a5ec61b6a320cf032c3f66825408dfc8b8835eb660e7e46ce64b256c9f9448548730ad39d96d33c51847608dd8001873cd34c62f1cdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ejpecp-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
