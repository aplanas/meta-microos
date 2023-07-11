SUMMARY = "Documentation for texlive-ejpecp"
DESCRIPTION = "This package includes the documentation for texlive-ejpecp"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11.3svn60950"

RPM_NAME = "texlive-ejpecp-doc-2023.201.1.11.3svn60950-53.2.noarch.rpm"
RPM_HASH = "5b7ea07d95e361a25e38db149a7bd213179d828020b1b93b5a49a628bb06e2ecf29e9e4170c250315e70e220ac8bcd8d13e46dbd358188c18eb2f15e6550e820"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ejpecp-doc"

RDEPENDS:${PN} += "/usr/bin/python3"

inherit rpm
