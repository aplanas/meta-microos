SUMMARY = "Documentation for texlive-yhmath"
DESCRIPTION = "This package includes the documentation for texlive-yhmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn54377"

RPM_NAME = "texlive-yhmath-doc-2023.201.1.6svn54377-52.1.noarch.rpm"
RPM_HASH = "0df5ecc7064c43e59674647da89c65ecdc4e81a0f9d88c4f40c71b31c522b224dd43d2733439b7914139aac26fc9a6f4ca8b37a0ecbb2254c7532e8387cdc3a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yhmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
