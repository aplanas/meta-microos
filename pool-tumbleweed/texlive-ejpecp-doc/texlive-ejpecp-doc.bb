SUMMARY = "Documentation for texlive-ejpecp"
DESCRIPTION = "This package includes the documentation for texlive-ejpecp"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11.3svn60950"

RPM_NAME = "texlive-ejpecp-doc-2023.201.1.11.3svn60950-53.1.noarch.rpm"
RPM_HASH = "f21ba510764a87422f8966540c4d0ade494d6cdd3a7290a3d043b616b2f994fd97904e14a5e24b5242ae4f6095f3fc6a1d6027ba72fd50f73f4c7fa19f6f01f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ejpecp-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
