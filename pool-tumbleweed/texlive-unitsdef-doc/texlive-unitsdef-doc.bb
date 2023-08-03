SUMMARY = "Documentation for texlive-unitsdef"
DESCRIPTION = "This package includes the documentation for texlive-unitsdef"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-unitsdef-doc-2023.209.0.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "5b3977d6855b6e5417d2a58f5d81e59555d5c7bdf4d4ab5cde748a34db43dfd083193c7366c549a8dddef9ad7aad5437a3f5c710ef7dce00f65b21c627569fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unitsdef-doc"

RDEPENDS:${PN} += ""

inherit rpm
